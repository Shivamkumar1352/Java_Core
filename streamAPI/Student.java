package streamAPI;

public class Student {
	private String name;
	private int age;
	
	public int getId() {
		return age;
	}
	public void setId(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Student(){
		
	}
	Student(String name, int age){
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: "+name+", age: "+age;
	}
	
}
