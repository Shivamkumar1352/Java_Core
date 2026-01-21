package arrayList;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

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
		
		Student key = new Student("Shivam",111);
		System.out.println(students.contains(key));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the id: ");
		int id = sc.nextInt();
		
		ListIterator<Object> i = students.listIterator();
		
		boolean notFound =true;
		
		while(i.hasNext() && notFound) {
			Student temp = (Student)(i.next());
			
			if(temp.id==id) {
				notFound = false;
				System.out.println("Student found!!!");
				System.out.println("Student name is: "+temp.name);
			}
		}
		if(notFound) {
			System.out.println("Student with id "+id+" not found in the collection");
		}
		sc.close();
	}

}
