package staticMembers;

public class Student {
	static String college = "LPU";
	String name;
	String regNo;
	String email;
	double cgpa;
	public Student() {
		
	}
	public Student(String name) {
		this();
		this.name = name;
	}
	public Student(String name, String regNo) {
		this(name);
		this.regNo = regNo;
	}
	public Student(String name, String regNo, String email) {
		this(name,regNo);
		this.email = email;
	}
	public Student(String name, String regNo, String email, double cgpa) {
		this(name,regNo,email);
		this.cgpa = cgpa;
	}
	
	public void getDetails() {
		System.out.println("Name: "+name);
		System.out.println("Reg no: "+regNo);
		System.out.println("Email: "+email);
		System.out.println("cgpa: "+cgpa);
		System.out.println("college: "+college);
	}
	
	public static void changeCollege(String newCollege) {
		college = newCollege;
	}
	
}
