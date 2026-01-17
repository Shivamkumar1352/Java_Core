package assignment3;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		int esum = 0;
		int osum = 0;
		for(int i=0; i<n; i++) {
			if(a[i]%2==0)
				esum+=a[i];
			else
				osum+=a[i];
		}
		System.out.println(esum-osum);
		sc.close();
	}

}
