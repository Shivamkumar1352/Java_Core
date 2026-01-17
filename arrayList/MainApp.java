package arrayList;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> students = new ArrayList<>();
		students.add(new Student("Shivam",111));
		students.add(new Student("Bhavik", 123));
		students.add(new Student("Vivek", 124));
		Student s = new Student("Abhijeet", 223);
		students.add(s);
		System.out.println(students);
		
		System.out.println(students.contains(s));
		System.out.println(students.indexOf(s));
		
	}

}
