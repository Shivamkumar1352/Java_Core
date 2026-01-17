package exceptionHandling;

public class OverAgeException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	String message;
	
	public OverAgeException() {
		
	}
	public OverAgeException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
