import java.util.Scanner;
public class task {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month number: ");
		int x = input.nextInt();
		switch(x){
		case 1: 
		case 3: 
		case 5: 
		case 7: 
		case 8: 
		case 10:
		case 12: System.out.println("31");
		break;
		case 2: System.out.println("28");
		break;
		case 4: 
		case 6: 
		case 9: 
		case 11: System.out.println("30");
		break;
		}
		input.close();
	}
}
