package wrapperClasses;

public class Parse {
	public static void main(String[] args) {
		String s = "123";
		int a = Integer.parseInt(s);
		System.out.println(a);
		
		byte b = Byte.parseByte(s);
		System.out.println(b);
		
		String s2 = "TrUe";
		boolean c = Boolean.parseBoolean(s2);
		System.out.println(c);
	}
}
