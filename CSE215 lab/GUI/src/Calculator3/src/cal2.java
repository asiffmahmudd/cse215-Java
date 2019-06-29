import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class cal2 extends Application implements EventHandler<ActionEvent>{
	private Button plus;
	private Button minus;
	private Button divide;
	private Button multiply;
	private TextField t1;
	private TextField t2;
	private TextField r;
	private Label result;
  
  public void start(Stage primaryStage) {
	  
	plus = new Button("+");
	minus = new Button("-");
	divide = new Button("/");
	multiply = new Button("*");
	t1 = new TextField();
	t2 = new TextField();
	r = new TextField();
	result = new Label("Result");
  
	GridPane gridPane = new GridPane();
    gridPane.setAlignment(Pos.CENTER);
    gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    gridPane.setHgap(10);
    gridPane.setVgap(10);
	
    HBox h1 = new HBox();
    h1.setSpacing(25);
    h1.getChildren().addAll(t1,t2);
    
    HBox h2 = new HBox();
    h2.setSpacing(5);
    h2.getChildren().addAll(plus,minus,divide,multiply);
    
    HBox h3 = new HBox();
    h3.setSpacing(5);
    h3.getChildren().addAll(result,r);

    gridPane.add(h1, 0, 0);
    gridPane.add(h1, 0, 1);
    gridPane.add(h1, 0, 2);

    plus.setOnAction(this);
    minus.setOnAction(this);
    divide.setOnAction(this);
    multiply.setOnAction(this);

    Scene scene = new Scene(gridPane, 600, 400);
    primaryStage.setTitle("Calculator");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  public void handle(ActionEvent event) {
	  if(event.getSource() == plus){
		  double n1 = Double.parseDouble(t1.getText());
		  double n2 = Double.parseDouble(t2.getText());
		  r.setText(""+(n1+n2));
	  }
	  else if(event.getSource() == minus){
		  double n1 = Double.parseDouble(t1.getText());
		  double n2 = Double.parseDouble(t2.getText());
		  r.setText(""+(n1-n2));
	  }
	  else if(event.getSource() == divide){
		  double n1 = Double.parseDouble(t1.getText());
		  double n2 = Double.parseDouble(t2.getText());
		  r.setText(""+(n1/n2));
	  }
	  else if(event.getSource() == multiply){
		  double n1 = Double.parseDouble(t1.getText());
		  double n2 = Double.parseDouble(t2.getText());
		  r.setText(""+(n1*n2));
	  }
  }
  
  public static void main(String[] args) {
	 launch(args);
  }
}