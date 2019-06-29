import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class Calculator extends Application{
	private Button plus;
	private Button minus;
	private Button divide;
	private Button multiply;
	private TextField t1;
	private TextField t2;
	private TextField r;
	
	
	 public void start(Stage primaryStage) {
		  
		 	plus = new Button("+");
			minus = new Button("-");
			divide = new Button("/");
			multiply = new Button("*");
			t1 = new TextField();
			t2 = new TextField();
			r = new TextField();
		    
			GridPane gridPane = new GridPane();
		    gridPane.setHgap(5);
		    gridPane.setVgap(5);
		    gridPane.add(t1, 1, 0);
		    gridPane.add(t2, 2, 0);
		    gridPane.add(plus, 0, 1);
		    gridPane.add(minus, 1, 1);
		    gridPane.add(divide, 2, 1);
		    gridPane.add(multiply, 3, 1);
		    gridPane.add(new Label("Result:"), 2, 2);
		    gridPane.add(r, 3, 2);

		    gridPane.setAlignment(Pos.CENTER);

		    Scene scene = new Scene(gridPane, 400, 500);
		    primaryStage.setTitle("Calculator");
		    primaryStage.setScene(scene);
		    primaryStage.show();
		  }
	 public static void main(String args[]){
		 launch(args);
	 }
}