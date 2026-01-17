package assignment2;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0)
			System.out.println("negative");
		else if(n==0)
			System.out.println("zero");
		else
			System.out.println("positive");
		sc.close();
	}

}
