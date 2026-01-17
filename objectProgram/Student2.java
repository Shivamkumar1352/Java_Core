package objectProgram;

public class Student2 {
	String pan;
	String adhaar;
	String voterId;
	Student2(){
		
	}
	Student2(String pan){
		this();
		this.pan = pan;
	}
	Student2(String pan, String adhaar){
		this(pan);
		this.adhaar = adhaar;
	}
	Student2(String pan, String adhaar, String voterId){
		this(pan, adhaar);
		this.voterId = voterId;
	}
}
