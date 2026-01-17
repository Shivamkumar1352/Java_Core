package loop;
import java.util.*;
public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ans;
		do {
			System.out.println("Weclome\nDo you want me to meet again?");
			ans = sc.next().charAt(0);
		}while(ans=='y');
		sc.close();
	}

}
