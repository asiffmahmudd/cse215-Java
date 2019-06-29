
public class RegularEmployee extends Employee{
	private double basesalary;
	private double conveyances;
	private double deduction;
	private double as;
	
	public RegularEmployee(String n, String add, int a, double b, double c, double d){
		super(n, add, a);
		this.basesalary = b;
		this.conveyances = c;
		this.deduction = d;
	}
	
	public void setBasesalary(double x){
		basesalary = x;
	}
	public void setConveyances(double x){
		conveyances = x;
	}
	public void setDeduction(double x){
		deduction = x;
	}
	
	public double getBasesalary(){
		return basesalary;
	}
	public double getConveyances(){
		return conveyances;
	}
	public double getDeduction(){
		return deduction;
	}
	
	public void computeAnnualSalary(){
		as = (basesalary+conveyances-deduction)*12;
	}
	public double getAnnualSalary(){
		return as;
	}
	
	public String toString(){
		return ("\nBasesalary: "+getBasesalary()+"\nConveyances: "+getConveyances()+"\nDeduction: "+getDeduction()+ "\nAnnual Salary: "+getAnnualSalary());
	}
}
