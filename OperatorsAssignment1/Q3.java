package OperatorsAssignment1;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary = 40000;
		int rating = 4;
		int experience = 6;
		boolean underDisiplinary = true;
		boolean isEligible = (rating>4 || experience>5)&& underDisiplinary;
		System.out.println(isEligible?"Eligible for increment":"Not eligble");
		System.out.println("Your Salary is: " + (isEligible?salary+=10000:salary));
		
	}

}
