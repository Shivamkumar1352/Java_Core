package anonomousClass;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Shivam");
		s1.display();
		
		
		Student s2 = new Student("Kavya") {
			@Override
			public void display() {
				System.out.println(name + " is a trainer");
			}
		};
		s2.display();
	}

}
