package inheritence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Student("Shivam", 22); //upCasting
		Student s1 = (Student)(p1); //downCasting
		System.out.println(s1.name+" "+s1.id);
	}

}
