package OperatorsAssignment1;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speedLimit = 60;
		int speed = 100;
		boolean isEmergency = true;
		int fine = speed>speedLimit && !isEmergency?2000:0;
		System.out.println(fine>0?"will get fine":"will not get fine");
		System.out.println("the total penalty is: "+ fine);
		
	}

}
