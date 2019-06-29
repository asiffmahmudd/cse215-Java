
public class Employee {
	private String name;
	private String address;
	private int age;
	
	public Employee(String n, String add, int a){
		name = n;
		address = add;
		age = a;
	}
	
	public void setName(String s){
		name = s;
	}
	public void setAddress(String s){
		address = s;
	}
	public void setAge(int s){
		age = s;
	}
	
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public int getAge(){
		return age;
	}
	
	public String toString(){
		return ("\nName:"+getName()+"\nAddress: "+getAddress()+"\nAge: "+getAge());
	}
}
