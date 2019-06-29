import java.util.*;

public class Solution {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		
		for(int i = 1; i <= n; i++){
			String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
		}
		
		while(in.hasNext()){
            String s = in.next();
            if(phoneBook.get(s) == null){
            	System.out.println("Not found");
            }
            else{
            	System.out.println(s+"="+phoneBook.get(s));
            }
        }
        in.close();
	}
}
