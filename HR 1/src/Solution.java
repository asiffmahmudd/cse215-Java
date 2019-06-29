import java.util.Scanner;

public class Solution {
	public static void main(String args[]){
		
		int i = 4;
		double d = 4.0;
		String s = "Hacker ";
		Scanner scan = new Scanner(System.in);
		
		int j;
        double k;
        String l;

        
        j = scan.nextInt();
        k = scan.nextDouble();
        scan.nextLine();
        l = scan.nextLine();
        
        System.out.println(i+j);
        System.out.println(d+k);
        System.out.println(s+l);
        
        scan.close();
	}
}
