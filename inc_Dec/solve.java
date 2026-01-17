package inc_Dec;

public class solve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = a++ + ++a + a;
		System.out.println(b);
		int c = --a + ++b + b--;
		System.out.println(c);
		int d = a + b + c + a--;
		System.out.println(d);
	}

}
