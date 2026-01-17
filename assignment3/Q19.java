package assignment3;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		int ele = sc.nextInt();
		int idx = sc.nextInt();
		a[idx]=ele;
		for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
		sc.close();
	}

}
