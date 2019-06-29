package task2;
import java.util.Date;
public class Employee extends Person{
	private String office;
	private String salary;
	private Date date;
	
	public Employee(String n, String a, String num, String e, String o, String s, String d){
		super(n, a, num, e);
		this.office = o;
		this.salary = s;
		this.date = new Date();
	}
	
	public void setoffice(String s){
		office = s;
	}
	public void setsalary(String s){
		salary = s;
	}
	public void setdate(String s){
		date = s;
	}
	
	public String getoffice(){
		return office;
	}
	public String getsalary(){
		return salary;
	}
	public String getdate(){
		return date;
	}
	
	public String toString(){
		return ("Office: "+getoffice()+"\nSalary: "+getsalary()+"Date: "+getdate()+"\n");
	}
}
