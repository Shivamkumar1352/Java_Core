package OperatorsAssignment1;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 47;
		int attendance = 82;
		boolean isPass = marks>=40 && attendance>75?true:false;
		System.out.println(isPass?"passed with "+ (marks+=5) +" marks":"fail");
	}

}
