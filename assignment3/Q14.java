package assignment3;

import java.util.Scanner;

public class Q14 {
	
	public static int numOfDigits(int n) {
		int ans = 0;
		while(n>0) {
			ans++;
			n/=10;
		}
		return ans;
	}
	
	public static boolean armstrong(int n) {
		int len = numOfDigits(n);
		int ans = 0;
		int temp = n;
		while(temp>0) {
			int a = 1;
			for(int i=1; i<=len; i++)
				a*=temp%10;
			ans+=a;
			temp/=10;
		}
		return ans==n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.print(armstrong(a[i])?a[i]+" ":"");
		}
		sc.close();
	}

}
