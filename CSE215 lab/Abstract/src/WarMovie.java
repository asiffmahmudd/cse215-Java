
public class WarMovie extends Movie{
	private String about;

	public WarMovie(String title, String director, double rating, String about) {
		super(title, director, rating);
		this.about = about;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public void changeRatingScale(){
		double r = getRating();
		r = r*10;
		setRating(r);
	}
	
	@Override
	public String toString() {
		return "WarMovie [about=" + about + ", toString()=" + super.toString() + "]";
	}
	
	
}
