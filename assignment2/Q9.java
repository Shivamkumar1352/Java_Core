package assignment2;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		if(s1==s2 && s2==s3)
			System.out.println("Equilateral Triangle");
		else if(s1==s2 || s2==s3 || s3==s1)
			System.out.println("Isoceles Triangle");
		else
			System.out.println("Scalen Triangle");
		sc.close();
	}

}
