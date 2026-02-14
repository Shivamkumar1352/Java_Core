package regEx;

public class Alphabets {
	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println(s1.matches("[a-z]+"));
		
		String s2 = "ABC";
		System.out.println(s2.matches("[A-Z]+"));
		
		String s3 = "aAbC";
		System.out.println(s3.matches("[a-zA-z]+"));
		
		String s4 = "A1sk3";
		System.out.println(s4.matches("[a-zA-Z0-9]+"));
		
		String s5 = "shivam1352@gmail.com";
		System.out.println(s5.matches("[a-zA-Z0-9]+@[a-z]+\\.[a-z]{2,3}"));
		System.out.println();
	}
}
