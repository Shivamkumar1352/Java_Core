package pattern;

import java.util.Scanner;

public class P19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=2*n; i++) {
			for(int j=1; j<=2*n; j++) {
				if(i+j>=n+1 && j-i<n && i-j<n && i+j<3*n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
