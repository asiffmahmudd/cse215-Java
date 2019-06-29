import java.util.*;

public class Main {
	public static void main(String args[]){
		Movie m1 = new AnimationMovie("Harry Potter", "Someone", 9.2, 7, "Harry");
		Movie m2 = new WarMovie("Saving Private Rayan", "None", 8.9, "Saving rayan");
		
		((AnimationMovie)m1).setMainCharacter("Hermione");
		
		m1.changeRatingScale();
		m2.changeRatingScale();
		
		ArrayList<Movie> array = new ArrayList<Movie>();
		array.add(m1);
		array.add(m2);
		
		for(Movie m : array){
			System.out.println(m.toString());
		}
		
		Movie m = checkPopularity(m1,m2);
		System.out.println(m.getTitle());
	}
	
	public static Movie checkPopularity(Movie mv1, Movie mv2){
		double r1 = mv1.getRating();
		double r2 = mv2.getRating();
		double r;
		
		r1 = r1*2;
		r2 = r2/10;
		
		if(r1>r2){
			return mv1;
		}
		else{
			return mv2;
		}
		
	}
}
