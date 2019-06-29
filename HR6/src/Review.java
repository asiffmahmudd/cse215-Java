import java.util.Scanner;
public class Review {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		input.nextLine();
		for(int i = 1; i <= T; i++){
			String s = input.nextLine();
			char a[] = s.toCharArray();
			for(int j = 0; j < s.length(); j++){
				if(j % 2 == 0){
					System.out.print(a[j]);
				}
			}
			System.out.print(" ");
			for(int j = 0; j < s.length(); j++){
				if(j % 2 != 0){
					System.out.print(a[j]);
				}
			}
			System.out.println();
		}
		input.close();
	}
}
