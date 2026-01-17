package assignment3;

import java.util.Scanner;

public class Q15 {
	
	public static int reverse(int n) {
		int ans = 0;
		while(n>0) {
			ans = ans*10+n%10;
			n/=10;
		}
		return ans;
	}
	
	public static boolean palindrome(int n) {
		return n == reverse(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.print(palindrome(a[i])?a[i]+" ":"");
		}
		sc.close();
	}

}
