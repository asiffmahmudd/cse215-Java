import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.event.*;

public class LogIn{
	
	Label l;
	PasswordField t;
	Button b;
	Stage stage;
	String pass = "1234";
	
	public void login(){
		
		l = new Label("Please Enter Administrator Password: ");
		t = new PasswordField();
		
		b = new Button("Log In");
		b.setMinSize(100, 20);
		b.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent event){
					if(t.getText().equals(pass)){
						Options o = new Options();
						o.options();
						stage.close();
					}
					else {
						Alert a = new Alert();
						a.alert("Error", "Invalid Password. Please Try Again");
					}
				}
			}
		);
		
		VBox v = new VBox();
		v.setPadding(new Insets(20,20,20,20));
		v.setSpacing(20);
		v.getChildren().addAll(l,t,b);
		
		Scene s = new Scene(v,300,170);
		stage = new Stage();
		stage.setScene(s);
		stage.setTitle("Log In");
		stage.show();
	}
}