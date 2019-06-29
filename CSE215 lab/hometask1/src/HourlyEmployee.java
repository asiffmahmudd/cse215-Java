
public class HourlyEmployee extends Employee{
	private double avghour;
	private double hsalary;
	private double as;
	
	public HourlyEmployee(String n, String add, int a, double ah, double hs){
		super(n, add, a);
		this.avghour = ah;
		this.hsalary = hs;
	}
	
	public void setAvghour(double d){
		avghour = d;
	}
	public void setHsalary(double d){
		hsalary = d;
	}
	
	public double getAvghour(){
		return avghour;
	}
	public double getHsalary(){
		return hsalary;
	}
	
	public void computeAnnualSalary(){
		as = hsalary*avghour*5*52;
	}
	public double getAnnualSalary(){
		return as;
	}
	
	public String toString(){
		return ("\nAverage Working Hour: "+getAvghour()+"\nHourly Salary: "+getHsalary()+ "\nAnnual Salary: "+getAnnualSalary());
	}
}
