package assignment3;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		int[] b = new int[n];
		for(int i=0; i<n; i++)
			b[i]=a[i];
		for(int i=0; i<n; i++)
			System.out.print(b[i]+" ");
		sc.close();
	}

}
