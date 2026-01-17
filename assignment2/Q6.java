package assignment2;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		int days = 30;
		
		switch(month) {
		
		case "Jan":
			days = 31;
			break;
		
		case "Feb":
			days = 28;
			break;
		
		case "Mar":
			days = 31;
			break;
		
		case "Apr":
			days = 30;
			break;
			
		case "May":
			days = 31;
			break;
		
		case "Jun":
			days = 30;
			break;
			
		case "Jul":
			days = 31;
			break;
		
		case "Aug":
			days = 31;
			break;
		
		case "Sep":
			days = 30;
			break;
		
		case "Oct":
			days = 31;
			break;
		
		case "Nov":
			days = 30;
			break;
		
		case "Dec":
			days = 31;
			break;
		
		}
		System.out.println(days);
		sc.close();
	}

}
