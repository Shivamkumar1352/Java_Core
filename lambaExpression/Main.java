package lambaExpression;

public class Main {

	public static void main(String[] args) {
		
		Test t = ()->{
			System.out.println("hi");
			System.out.println("hello");
		};
		t.test();
		// TODO Auto-generated method stub
		Add A = (a,b)->a+b;
		int b = A.add(7, 3);
		System.out.println(b);
		
	}

}
