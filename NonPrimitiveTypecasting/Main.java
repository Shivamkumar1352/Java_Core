package NonPrimitiveTypecasting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//upcasting
		A a = new D();
		System.out.println(a instanceof A);
		System.out.println(a instanceof C);
		System.out.println(a instanceof D);
		System.out.println(a instanceof B);
		
		if(a instanceof B) {
			B b = (B)a;
			System.out.print(b);
		}
		else {
			System.out.println("Don't have instance of this class");
		}
	}
}
