
public class WarMovie extends Movie{
	private String about;
	
	public WarMovie(String t, String d, double r, String a){
		super(t, d, r);
		about = a;
	}
	
	public void changeRatingScale(){
		double r = getRating();
		setRating(r*10);
	}
	
	public String toString(){
		return ("Title: "+getTitle()+"\tDirector: "+getDirector()+"\tRating: "+getRating()+"\tAbout: "+about);
	}
}
