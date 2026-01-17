package OperatorsAssignment1;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 5000;
		boolean isActive = true;
		int withdrawal = 2000;
		boolean isAllowed = balance>0 && isActive;
		System.out.println(isAllowed?"Allowed":"Denied");
		balance-=withdrawal;
		System.out.println("Your balance is: "+ balance);
		
	}

}
