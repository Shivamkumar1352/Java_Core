package OperatorsAssignment1;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 120;
		int time = 37;
		boolean usedCheats = false;
		int bonus = score>100 && time<40 && !usedCheats?50:0;
		System.out.println(bonus>0?"Got a bonus of "+bonus:"No bonus was given");
		score += bonus;
		System.out.println("The total score is: "+score);
	}

}
