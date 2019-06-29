import java.util.Scanner;
public class Solution {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a[] = new int[100000];
		int i = 0;
		
		while(x/10 != x){
			a[i] = x%2;
			x = x/2;
			i++;
		}
		int c = 1, m = 1, k;
		for(k = i-1; k >= 0; k--){
			if(a[k] == 1 && a[k+1] == 1){
				c++;
			}
			else{
				c =1;
			}
			if(c > m){
				m = c;
			}
		}
		System.out.println(m);
	}
}
