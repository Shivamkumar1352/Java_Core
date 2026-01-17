package decisionMaking;
import java.util.Scanner;
public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		switch(c) {
		
		case 'A':
			System.out.println("Apple");
			break;
		
		case 'B':
			System.out.println("Ball");
			break;
			
		case 'C':
			System.out.println("Cat");
			break;
			
		case 'D':
			System.out.println("Dog");
			break;
		case 'E':
			
			System.out.println("Elephant");
			break;
			
			}
		sc.close();
	}

}
