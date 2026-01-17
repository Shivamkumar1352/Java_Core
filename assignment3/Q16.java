package assignment3;

import java.util.Scanner;

public class Q16 {
	
	public static boolean checkPrime(int n) {
		for(int i=2; i*i<=n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.print(checkPrime(a[i])?a[i]+" ":"");
		}
		sc.close();
	}

}
