
public class AnimationMovie extends Movie{
	private int sequels;
	private String mainCharacter;
	
	public AnimationMovie(String title, String director, double rating, int sequels, String mainCharacter) {
		super(title, director, rating);
		this.sequels = sequels;
		this.mainCharacter = mainCharacter;
	}

	public int getSequels() {
		return sequels;
	}

	public void setSequels(int sequels) {
		this.sequels = sequels;
	}

	public String getMainCharacter() {
		return mainCharacter;
	}

	public void setMainCharacter(String mainCharacter) {
		this.mainCharacter = mainCharacter;
	}

	public void changeRatingScale(){
		double r = getRating();
		r = r/2;
		setRating(r);
	}
	
	@Override
	public String toString() {
		return "AnimationMovie [sequels=" + sequels + ", mainCharacter=" + mainCharacter + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
