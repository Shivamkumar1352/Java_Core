package exceptionHandling;

import java.util.Scanner;


public class Program02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of num1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the value of num2: ");
		int num2 = sc.nextInt();
		
//		try {
//			System.out.println(num1/num2);			
////			String str = null;
////			System.out.println(str.toUpperCase());
//		}catch(Exception e) {
////			System.out.println(e.getMessage());
////			System.out.println(e.getClass());
//			e.printStackTrace();
//			
//		}
//		finally {
//			System.out.println("isko to print krna hi krna hai!!!");
//		}
		
		
//		NumberFormatException
//		int a = Integer.parseInt("abz12");
//		System.out.println(a);
		
		
//		throw
		sc.close();
		if(num2 == 0) {
			throw new WrongInputException("Number can not be divided by zero");
		}
		else {
			System.out.println(num1/num2);
		}
	}

}
