package OperatorsAssignment1;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 5000;
		boolean isPremium = true;
		boolean firstVisit = true;
		int discount = amount>2000 && (isPremium || firstVisit)?500:0;
		System.out.println(discount>0?"One discount available":"No discount available");
		System.out.println("your total amount is "+ (amount-=discount));
		
	}

}
