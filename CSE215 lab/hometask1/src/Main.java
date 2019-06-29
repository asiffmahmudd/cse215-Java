
public class Main {
	public static void main(String args[]){
		Employee e = new Employee("Asif", "Bashundhara", 21);
		RegularEmployee r = new RegularEmployee("Ronaldo", "Spain", 30, 1000000, 20000, 2000);
		HourlyEmployee h = new HourlyEmployee("Messi", "Spain", 29, 10, 2000);
		r.computeAnnualSalary();
		h.computeAnnualSalary();
		System.out.println(e.toString());
		System.out.println(r.toString());
		System.out.println(h.toString());
	}
}
