package mapProgram;

import java.util.TreeMap;

public class StudentTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Student, Integer> tm = new TreeMap<>(new StudentComparator());
		tm.put(new Student(2,"Shivam"), 1);
		tm.put(new Student(1,"Pragy"), 2);
		tm.put(new Student(3, "Abhijeet"), 3);
		tm.put(new Student(4, "Rohit"), 4);
		System.out.println(tm);
	}

}

