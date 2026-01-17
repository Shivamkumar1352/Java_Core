package staticMembers;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("shivam");
		Student s2 = new Student("Ravi", "12219665");
		Student s3 = new Student("Rekha", "12218437", "rekha@gmail.com");
		Student s4 = new Student("Tom", "12215736","tom@gmail.com",8.15);
		s1.getDetails();
		s2.getDetails();
		s3.getDetails();
		s4.getDetails(); 
		Student.changeCollege("CGC");
		s1.getDetails();
	}

}
