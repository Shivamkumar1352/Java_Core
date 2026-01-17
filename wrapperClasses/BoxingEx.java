package wrapperClasses;

public class BoxingEx {

	public static void main(String[] args) {
		
		//Boxing
		int a=10;
		@SuppressWarnings("removal")
		Integer i1 = new Integer(a);
		System.out.println(i1);
		
		int b = 20;
		Integer i2 = Integer.valueOf(b);
		System.out.println(i2);
		
		
		//AutoBoxing
		int x = 30;
		Integer i3 = x;
		System.out.println(i3);
		
	}
}
