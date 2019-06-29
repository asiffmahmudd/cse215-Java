package task2;

public class Person {
	private String name;
	private String address;
	private String number;
	private String email;
	
	public Person(String n, String a, String num, String e){
		name = n;
		address = a;
		number  = num;
		email = e;
	}
	
	public void setname(String s){
		name = s;
	}
	public void setaddress(String s){
		address = s;
	}
	public void setnumber(String s){
		number = s;
	}
	public void setemail(String s){
		email = s;
	}
	
	public String getname(){
		return name;
	}
	public String getaddress(){
		return address;
	}
	public String getnumber(){
		return number;
	}
	public String getemail(){
		return email;
	}
	
	public String toString(){
		return ("Name: "+getname()+"\nAddress: "+getaddress()+"\nNumber: "+getnumber()+"\nEmail: "+getemail()+"\n");
	}
}
