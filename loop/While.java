package loop;
import java.util.*;
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int num = 1;
		while(num<=n) 
			System.out.println(num++);
		sc.close();
		
	}

}
