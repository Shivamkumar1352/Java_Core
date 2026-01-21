package setProgram;

import java.util.TreeSet;

public class StudentTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> set = new TreeSet<>(new StudentComparator());
		set.add(new Student("Shivam",1));
		set.add(new Student("Abhishek",3));
		set.add(new Student("Ravi", 2));
		set.add(new Student("Rohit",6));
		set.add(new Student("Bhavik",5));
		System.out.println(set);
		
	}

}
