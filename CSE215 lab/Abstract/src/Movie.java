
public abstract class Movie {
	private String title;
	private String director;
	private double rating;
	
	public Movie(String title, String director, double rating) {
		super();
		this.title = title;
		this.director = director;
		this.rating = rating;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public abstract void changeRatingScale();
	
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", rating=" + rating + "]";
	}
	
}
