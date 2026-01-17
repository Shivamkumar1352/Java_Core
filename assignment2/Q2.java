package assignment2;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b)
			if(a>c)
				System.out.println(a);
		if(b>c)
			if(b>a)
				System.out.println(b);
		if(c>a)
			if(c>b)
				System.out.println(c);
		sc.close();
		}
}
