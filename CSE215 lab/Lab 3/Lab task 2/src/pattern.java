import java.util.Scanner;
public class pattern {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		print(x);
	}
	public static void print(int a){
		int i, j, l = 1;
		for(i = 1; i <= a; i++){
			for(j = a; j >= l; j--){
				System.out.print(j+ " ");
			}
			System.out.println();
			l++;
		}
	}
}
