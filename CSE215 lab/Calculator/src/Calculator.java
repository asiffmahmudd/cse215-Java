import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javafx.*;
import javafx.scene.*;
import javafx.application.*;

public class Calculator extends JFrame{
	
	private JButton plus;
	private JButton minus;
	private JButton multiply;
	private JButton divide;
	private JLabel result;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private double n1;
	private double n2;
	private double r;
	public Calculator(){
		
		super("Calculator");
		setLayout(new FlowLayout());
		
		plus = new JButton("+");
		minus = new JButton("-");
		divide = new JButton("/");
		multiply = new JButton("*");
		result = new JLabel("Result:");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		
		n1 = Double.parseDouble(t1.getText());
		n2 = Double.parseDouble(t2.getText());
		
		add(plus);
		add(minus);
		add(divide);
		add(multiply);
		add(t1);
		add(t2);
		add(result);
		add(t3);
		
		plus.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						r = n1+n2;
						t3.setText(""+r);
					}
				}
		);
		minus.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						r = n1-n2;
						t3.setText(""+r);
					}
				}
		);
		divide.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						r = n1/n2;
						t3.setText(""+r);
					}
				}
		);
		multiply.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						r = n1*n2;
						t3.setText(""+r);
					}
				}
		);
	}
}
