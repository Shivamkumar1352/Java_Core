package objectProgram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		Book b1 = new Book();
//		b1.title = sc.nextLine();
//		b1.price = sc.nextInt();
//		System.out.println(b1.title);
//		System.out.println(b1.price);
		
		Book2 b2 = new Book2("SQL", 5000);
		System.out.println(b2.title);
		System.out.println(b2.price);
		sc.close();
	}

}
