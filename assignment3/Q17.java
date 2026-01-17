package assignment3;

import java.util.Scanner;

public class Q17 {
	
	public static boolean palindrome(int[] a) {
		int n = a.length;
		for(int i=0; i<n; i++){
			if(a[i]!=a[(n-1-i)])
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
		System.out.println(palindrome(a)?"array is palindrome":"array is not a palindrome");
		sc.close();
	}

}
