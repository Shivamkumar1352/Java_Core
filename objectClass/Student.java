package objectClass;

public class Student {
	String name;
	int id;
	
	Student(String name, int id){
		this.name = name;
		this.id=id;
	}
	
	public boolean equals(Student s) {
		return this.name.equals(s.name) && this.id==s.id;
	}
	
	public int hashCode() {
		return this.name.hashCode()+id;
	}
}

