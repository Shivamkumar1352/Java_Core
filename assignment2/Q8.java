package assignment2;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		float per = (float)(m1+m2+m3+m4+m5)/5;
		char grade = 'O';
		if(per>90)
			grade='O';
		else if(per>80)
			grade='A';
		else if(per>70)
			grade='B';
		else if(per>60)
			grade='C';
		else if(per>50)
			grade='D';
		else if(per>40)
			grade='E';
		else
			grade='F';
		
		System.out.println("Percentage: "+per);
		System.out.println("Grade: "+grade);
		sc.close();
		
	}

}
