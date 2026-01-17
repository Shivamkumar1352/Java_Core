
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15;
		System.out.println(num%5==0 && num%3==0?"Divisible by both":num%5==0?"Divisible by 5 only":num%3==0?"Divisible by 3 only":"Neither divisible by 5 nor 3");
	}

}
