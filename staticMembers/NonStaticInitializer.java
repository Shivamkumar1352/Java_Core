package staticMembers;

public class NonStaticInitializer {
	
	{
		System.out.println("hi, i am non-static initializer.");
	}
	
	public NonStaticInitializer() {
		System.out.println("hi, i am from constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi, i am from main method");
		NonStaticInitializer n = new NonStaticInitializer();
		System.out.println(n);
	}

}
