package streamAPI;
import java.util.ArrayList;



public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> s = new ArrayList<>();
		s.add(new Student("Shivam", 22));
		s.add(new Student("Abhijeet", 21));
		s.add(new Student("Aryan", 22));
		s.add(new Student("Bhavik", 21));
		
		s.stream()
		.filter(o->o.getName().startsWith("A"))
		.forEach(System.out::println);
	}

}
