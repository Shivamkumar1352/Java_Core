package mapProgram;

public class Student {
	int id;
	String name;
	Student(){
		
	}
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Id: "+this.id+", Name: "+this.name+"]";
	}
	
	
}
