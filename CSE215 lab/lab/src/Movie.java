
public abstract class Movie {
	private String title;
	private String director;
	private double rating;
	
	public Movie(String t, String d, double r){
		title = t;
		director = d;
		rating = r;
	}
	
	public void setRating(double r){
		rating = r;
	}
	public void setTitle(String s){
		title = s;
	}
	public void setDirector(String s){
		director = s;
	}
	
	public double getRating(){
		return rating;
	}
	public String getTitle(){
		return title;
	}
	public String getDirector(){
		return director;
	}
	public abstract void changeRatingScale();
	
	
	public String toString(){
		return ("Title: "+title+"\tDirector: "+director+"\tRating: "+rating);
	}
}
