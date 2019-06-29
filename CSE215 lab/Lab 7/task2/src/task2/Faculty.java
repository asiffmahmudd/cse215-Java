package task2;

public class Faculty extends Employee{
	private String officehour;
	private String rank;
	
	public Faculty(String n, String a, String num, String e, String o, String s, String d, String off, String r){
		super(n, a, num, e, o, s, d);
		this.officehour = off;
		this.rank = r;
	}
	
	public String getofficehour(){
		return officehour;
	}
	public String getrank(){
		return rank;
	}
	
	public String toString(){
		return ("Office Hour: "+getofficehour()+"\nRank: "+getrank()+"\n");
	}
}
