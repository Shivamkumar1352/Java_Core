package stringProgram;

public class StringBuffEx {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		
		//append
		s1.append("Hello");
		System.out.println(s1);
		
		//insert
		s1.insert(1, "Hii");
		System.out.println(s1);
		
		//reverse
		s1.reverse();
		System.out.println(s1);
		
		//replace
		s1.replace(1, 3, "zero");
		System.out.println(s1);
		
		//delete
		s1.delete(4, s1.length());
		System.out.println(s1);
		
		//capacity
		System.out.println(s1.capacity());
		
		s1.append("abcdefghtooefkh");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
	}
}
