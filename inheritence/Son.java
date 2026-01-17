package inheritence;

public class Son extends Father{
	String name = "Beta";
	public void display() {
		System.out.println("My father name is: " + super.name);
		System.out.println("My name is: "+ name);
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.display();
	}
}
