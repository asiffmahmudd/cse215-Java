
public class AnimationMovie extends Movie{
	private int sequels;
	private String mainCharacter;
	
	public AnimationMovie(String t, String d, double r, int s, String m){
		super(t, d, r);
		sequels = s;
		mainCharacter = m;
	}
	
	public void setMainCharacter(String s){
		mainCharacter = s;
	}
	public void setSequels(int a){
		sequels = a;
	}
	
	public String getMainCharacter(){
		return mainCharacter;
	}
	public int getSequels(){
		return sequels;
	}
	
	public void changeRatingScale(){
		double r = getRating();
		setRating(r/2);
	}
	
	public String toString(){
		return ("Title: "+getTitle()+"\tDirector: "+getDirector()+"\tRating: "+getRating()+"\tSequels: "+sequels+"\tMain Character: "+mainCharacter);
	}
}
