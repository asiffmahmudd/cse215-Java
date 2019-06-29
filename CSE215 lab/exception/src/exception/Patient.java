package exception;

public class Patient {
	private String name;
	private int age;
	private String disease;
	public String getName() {
		return name;
	}
	
	public Patient(String n, int a, String d) throws Exception{
			try{
				setName(n);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			try{
				setAge(a);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			setDisease(d);
	}
	public void setName(String name) throws InvalidNameException{
		if(name.length() < 3){
			throw new InvalidNameException("The name must contain more than 3 letters");
		}
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws IllegalArgumentException{
		if(age < 0){
			throw new IllegalArgumentException("Age cannot be negative");
		}
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	
}
