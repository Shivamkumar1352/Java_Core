package OperatorsAssignment1;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unit = 456;
		boolean isCommercial = true;
		int taxPercent = 8;
		float bill = 0;
		int billRate = unit>300 || isCommercial?10:0;
		bill += unit*billRate;
		float tax =  (taxPercent*bill)/100;
		bill += tax; 
		System.out.println("your total bill is: "+ bill);
	}

}
