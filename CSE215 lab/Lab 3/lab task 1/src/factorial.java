import java.util.Scanner;
public class factorial {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		System.out.println("Enter r: ");
		int r = input.nextInt();
		int a = fact(n);
		int b = fact(r);
		int c = fact(n-r);
		int f = a/b*c;
		System.out.println(f);
	}
	public static int fact(int x){
		int i, m = 1;
		for(i = 1; i <= x; i++){
			m = m*i;
		}
		return m;
	}
}
