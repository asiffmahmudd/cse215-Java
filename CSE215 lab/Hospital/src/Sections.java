import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.event.*;

public class Sections extends Application implements EventHandler<ActionEvent>{
	public static void main(String args[]){
		launch(args);
	}
	
	Label wl;
	Label cl;
	Button a;
	Button p;
	Stage window;
	
	public void start(Stage stage){
		
		wl = new Label("Welcome");
		wl.setMinSize(50, 50);
		
		cl = new Label("Please Choose One: ");
		
		a = new Button("Administrator");
		a.setMinSize(200, 50);
		a.setOnAction(this);
		p = new Button("Patient");
		p.setMinSize(200, 50);
		p.setOnAction(this);
		
		HBox h1 = new HBox();
		h1.setAlignment(Pos.CENTER);
		h1.setPadding(new Insets(10,10,10,10));
		h1.getChildren().add(wl);
		
		VBox v1 = new VBox();
		v1.setAlignment(Pos.CENTER);
		v1.setPadding(new Insets(10,10,10,10));
		v1.setSpacing(15);
		v1.getChildren().addAll(cl,a,p);
		
		BorderPane pane = new BorderPane();
		pane.setTop(h1);
		pane.setCenter(v1);
		
		window = stage;
		Scene s = new Scene(pane, 500,300);
		window.setScene(s);
		window.setTitle("Sections");
		window.show();
	}
	
	public void handle(ActionEvent event){
		if(event.getSource() == a){
			LogIn l = new LogIn();
			l.login();
			window.close();
		}
		else if(event.getSource() == p){
			Search s = new Search();
			window.close();
			s.search();
		}
	}
}