package assignment2;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(c>='A' && c<='Z')
			System.out.println("UpperCase");
		else if(c>='a'&& c<='z')
			System.out.println("LowerCase");
		else if(c>='0' && c<='9')
			System.out.println("Digit");
		else
			System.out.println("Special Character");
		sc.close();
	}

}
