import java.util.Scanner;
public class number {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter one-digit integers (enter negative to stop):");
		int x, m = 0;
		while(1 == 1){
			x = input.nextInt();
			if(x < 0) break;
			else {	
				m = m*10 + x;
			}
		}
		System.out.println(m);
	}
}
