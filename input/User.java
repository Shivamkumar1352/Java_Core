package input;
import java.util.*;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		char grade = sc.next().charAt(0);
		System.out.println(name+"\n"+age+"\n"+grade);
		sc.close();
	}

}
