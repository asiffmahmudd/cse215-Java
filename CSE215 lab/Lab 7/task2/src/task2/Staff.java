package task2;

public class Staff extends Employee{
	private String title;
	
	public Staff(String n, String a, String num, String e, String o, String s, String d, String t){
		super(n, a, num, e, o, s, d);
		this.title = t;
	}
	
	public String gettitle(){
		return title;
	}
	
	public String toString(){
		return ("Title: " +title+"\n");
	}
}
