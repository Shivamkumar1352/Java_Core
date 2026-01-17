package OperatorsAssignment1;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stock = 200;
		boolean fastMoving = true;
		boolean discontinued = false;
		int stockRequired = (stock<10 || fastMoving) && !discontinued ? 100 : 0;
		System.out.println(stockRequired>0?"reorder the stock":"Not required");
		System.out.println("Stock quantity is: "+ (stock+=stockRequired));
		
	}

}
