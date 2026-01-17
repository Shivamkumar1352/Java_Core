package OperatorsAssignment1;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 180;
		boolean isDisable = false;
		int attendance = 54;
		boolean isApproved = true;
		int extraTime = isDisable || (attendance<60 && isApproved)?60:0;
		System.out.println(extraTime>0?"Will get extra time":"will not get extra time");
		System.out.println("Your Total time is: "+(time+=extraTime));
	}

}
