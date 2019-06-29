package exception;

public class InvalidNameException extends Exception{
	public InvalidNameException(){
		super();
	}
	
	public InvalidNameException(String m){
		super(m);
	}
}
