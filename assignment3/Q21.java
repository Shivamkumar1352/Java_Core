package assignment3;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		for(int i=0; i<n/2; i++) {
			int temp = a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
		for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
		sc.close();
	}

}
