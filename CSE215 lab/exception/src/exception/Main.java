package exception;

public class Main {
	public static void main(String args[]) throws InvalidNameException{
		try{
			Patient object1 = new Patient("So", -2, "Fever");
			Patient object2 = new Patient("A", -1, "Headache");
			Patient object3 = new Patient("Sony", 21, "Malaria");
			System.out.println(object3.getName()+"\n"+object3.getAge()+"\n"+object3.getDisease());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
