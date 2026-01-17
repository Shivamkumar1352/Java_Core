package exceptionHandling;

public class UnderAgeException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	String message;
	
	public UnderAgeException() {
		
	}
	public UnderAgeException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}

}
