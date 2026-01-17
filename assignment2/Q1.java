package assignment2;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%5==0 && n%11==0) {
			System.out.println("The given number "+n+" is divisible by both 5 and 11");
		}
		sc.close();
		
	}

}
