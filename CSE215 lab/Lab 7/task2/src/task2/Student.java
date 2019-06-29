package task2;

public class Student extends Person{
	final String status = "Sophomore";
	
	public Student(String n, String a, String num, String e){
		super(n, a, num, e);
	}
	
	public String getstatus(){
		return status;
	}
	
	public String toString(){
		return ("Status: "+getstatus()+"\n");
	}
}
