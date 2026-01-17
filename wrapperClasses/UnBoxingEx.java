package wrapperClasses;

public class UnBoxingEx {
	public static void main(String[] args) {
		
		//Boxing
		int a = 10;
		Integer i = Integer.valueOf(a);
		
		//UnBoxing
		int b = i.intValue();
		System.out.println(b);
		
		//AutoBoxing
		int s = 77;
		Integer d = s;
		
		//AutoUnBoxing
		int f = d;
		System.out.println(f);
		
		
	}
}
