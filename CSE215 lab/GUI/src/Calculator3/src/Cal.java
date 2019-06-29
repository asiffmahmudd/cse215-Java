import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Cal extends Application {
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
	result = new Label("Result: ");
  
    GridPane gridPane = new GridPane();
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    gridPane.add(t1, 1, 0);
    gridPane.add(t2, 2, 0);
    gridPane.add(plus, 0, 1);
    gridPane.add(minus, 1, 1);
    gridPane.add(divide, 2, 1);
    gridPane.add(multiply, 3, 1);
    gridPane.add(result, 2, 2);
    gridPane.add(r, 3, 2);

    gridPane.setAlignment(Pos.CENTER);

    plus.setOnAction(e -> calculatePlus());
    minus.setOnAction(e -> calculateMinus());
    divide.setOnAction(e -> calculateDivide());
    multiply.setOnAction(e -> calculateMultiply());

    Scene scene = new Scene(gridPane, 600, 300);
    primaryStage.setTitle("Calculator");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  private void calculatePlus() {
    double n1 =
      Double.parseDouble(t1.getText());
    double n2 =
      Double.parseDouble(t2.getText());
    r.setText(""+(n1+n2));
  }
  private void calculateMinus() {
	    double n1 =
	      Double.parseDouble(t1.getText());
	    double n2 =
	      Double.parseDouble(t2.getText());
	    r.setText(""+(n1-n2));
  }
  private void calculateDivide() {
	    double n1 =
	      Double.parseDouble(t1.getText());
	    double n2 =
	      Double.parseDouble(t2.getText());
	    r.setText(""+(n1/n2));
  }
  private void calculateMultiply() {
	    double n1 =
	      Double.parseDouble(t1.getText());
	    double n2 =
	      Double.parseDouble(t2.getText());
	    r.setText(""+(n1*n2));
  }

  
  public static void main(String[] args) {
    launch(args);
  }
}