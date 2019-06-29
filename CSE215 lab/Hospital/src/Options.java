import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.event.*;

public class Options{
	
	Label cl;
	Button a;
	Button p;
	Stage stage;
	
	public void options(){
	
		stage = new Stage();
		cl = new Label("What Would You Like To Do: ");
		
		a = new Button("Add A New Patient");
		a.setMinSize(300, 50);
		a.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent event){
					PatientAdd p = new PatientAdd();
					p.patientAdd();
				}
			}
		);
		p = new Button("Search By Patient's ID");
		p.setMinSize(300, 50);
		p.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent event){
					Search x = new Search();
					x.search();
				}
			}
		);
		
		VBox v1 = new VBox();
		v1.setAlignment(Pos.CENTER);
		v1.setPadding(new Insets(10,10,10,10));
		v1.setSpacing(15);
		v1.getChildren().addAll(cl,a,p);
		
		Scene s = new Scene(v1, 500,300);
		stage.setScene(s);
		stage.setTitle("Options");
		stage.show();

	}
}