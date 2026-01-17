package staticMembers;

public class Demo {
	
	static int a=0;
	
	public static void m1() {
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		m1();
		Demo.m1();
		System.out.println(a);
		
	}
}
