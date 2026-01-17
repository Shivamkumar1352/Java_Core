package objectProgram;

public class Student {
	String pan;
	String adhaar;
	String voterId;
	Student(){
		
	}
	Student(String pan){
		this.pan = pan;
	}
	Student(String pan, String adhaar){
		this.pan = pan;
		this.adhaar = adhaar;
	}
	Student(String pan, String adhaar, String voterId){
		this.pan = pan;
		this.adhaar = adhaar;
		this.voterId = voterId;
	}
}
