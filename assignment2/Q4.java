package assignment2;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n/2==(n+1)/2)
			System.out.println("Even");
		else
			System.out.println("Odd");
		sc.close();
	}

}
