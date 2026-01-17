package objectProgram;

public class Student2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1 = new Student2();
		Student2 s2 = new Student2("LCDPK8131J");
		Student2 s3 = new Student2("PEDPK8132J","520960071553");
		Student2 s4 = new Student2("KFDPK8133J","520470071553","94204903840");
		
		System.out.println("s1 pan no. : "+(s1.pan==null?"not present":s1.pan));
		System.out.println("s1 adhaar no. : "+(s1.adhaar==null?"not present":s1.adhaar));
		System.out.println("s1 voterId no. : "+(s1.voterId==null?"not present":s1.voterId));
		System.out.println();
		System.out.println("s2 pan no. : "+(s2.pan==null?"not present":s2.pan));
		System.out.println("s2 adhaar no. : "+(s2.adhaar==null?"not present":s2.adhaar));
		System.out.println("s2 voterId no. : "+(s2.voterId==null?"not present":s2.voterId));
		System.out.println();
		System.out.println("s3 pan no. : "+(s3.pan==null?"not present":s3.pan));
		System.out.println("s3 adhaar no. : "+(s3.adhaar==null?"not present":s3.adhaar));
		System.out.println("s3 voterId no. : "+(s3.voterId==null?"not present":s3.voterId));
		System.out.println();
		System.out.println("s4 pan no. : "+(s4.pan==null?"not present":s4.pan));
		System.out.println("s4 adhaar no. : "+(s4.adhaar==null?"not present":s4.adhaar));
		System.out.println("s4 voterId no. : "+(s4.voterId==null?"not present":s4.voterId));
	}

}
