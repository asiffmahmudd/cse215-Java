import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Movie m1 = new AnimationMovie("Wall-E", "Mone nai", 9.7, 1, "Emma");
		Movie m2 = new WarMovie("Fury", "k jane", 8.9, "Good");
		
		m1.setRating(m1.getRating());
		m2.setRating(m2.getRating());
		
		System.out.println("Enter the modified name of the character:");
		AnimationMovie a = (AnimationMovie)m1;
		a.setMainCharacter(input.nextLine());
		
		m1.changeRatingScale();
		m2.changeRatingScale();
		
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(m1);
		list.add(m2);
		for(int i = 0; i < 2; i++){
			System.out.println(list.get(i).toString());
		}
		
		Movie m = CheckPopularity(m1, m2);
		System.out.println(m.getTitle()+" is more popular");
	}
	public static Movie CheckPopularity(Movie a, Movie b){
		if(a.getRating()*2 > b.getRating()/10) return a;
		else return b;
	}
	
}
