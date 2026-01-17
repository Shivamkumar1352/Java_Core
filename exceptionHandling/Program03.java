package exceptionHandling;

import java.util.Scanner;

public class Program03 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you age: ");
		int age = sc.nextInt();
		
		sc.close();
		if(age < 18) {
			throw new UnderAgeException("You are underage buddy!!!");
		}
		else if(age > 41){
			throw new OverAgeException("You are overage old-man!!!");
		}
		else {
			System.out.println("Please carry on young man!!!");
		}
	}
}
