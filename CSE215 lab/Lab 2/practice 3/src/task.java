import java.util.Scanner;
public class task {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a nummber: ");
		int n = input.nextInt();
		int x = 1;
		while(n >= 1){
			x = x*n;
			n--;
		}
		System.out.println("The factorial is: " +x);
		input.close();
	}
}
