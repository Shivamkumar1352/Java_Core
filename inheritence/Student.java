package inheritence;

public class Student extends Person{
	int id;
	Student(){
		
	}
	Student(String name, int id){
		super(name);
		this.id = id;
	}
}
