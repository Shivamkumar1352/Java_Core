package regEx;

public class Example1 {
	public static void main(String[] args) {
		String s1 = "1";
		System.out.println(s1.matches("\\d")); // only 1 digit
		
		String s2 = "123";
		System.out.println(s2.matches("\\d+")); //1 or more digits
		
		String s3 = "";
		System.out.println(s3.matches("\\d*")); //empty string also
		
		String s4 = "45678";
		System.out.println(s4.matches("^\\d+$")); //from start to end only number
		
		String s5 = "123";
		System.out.println(s5.matches("\\d{3}")); // only three digits
		
		String s6 = "1234567";
		System.out.println(s6.matches("\\d{3,7}"));
		
		String s7 = "10.7";
		System.out.println(s7.matches("^\\d+\\.\\d+$"));
		
		String gmail = "shivamkumar1352002@gmail.com";
		System.out.println(gmail.matches("\\w+@[a-z]+\\.[a-z]{3}"));
	}
}
