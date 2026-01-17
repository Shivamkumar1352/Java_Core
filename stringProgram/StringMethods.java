package stringProgram;

public class StringMethods {
	public static void main(String[] args) {
		
		String s1 = "Hello";
		
		//length() 
		System.out.println(s1.length());
		
		//toUpperCase() 
		System.out.println(s1.toUpperCase());

		//toLowerCase()
		System.out.println(s1.toLowerCase());
		
		//startsWith("string")
		System.out.println(s1.startsWith("H"));
		
		//endsWith("string")
		System.out.println(s1.endsWith("o"));
		
		//charAt(index);
		System.out.println(s1.charAt(0));
		
		//toCharArray()
		char[] c = s1.toCharArray();
		System.out.println(c);
		
		//split("string")
		String s2 = "Hii Hello Bye";
		String[] str = s2.split(" ");
		for(String s : str) {
			System.out.println(s);
		}
		
		//concat("string")
		String x = "Hi";
		System.out.println(x.concat(" Everyone"));
		
		//substring(start index)
		System.out.println(s1.substring(2));
		
		//substring(i,r) from index i to r-1
		System.out.println(s1.substring(2,4));  
		
	}
}
