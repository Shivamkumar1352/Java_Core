package exceptionHandling;

public class WrongInputException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	String message;
	WrongInputException(){
		
	}
	WrongInputException(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
