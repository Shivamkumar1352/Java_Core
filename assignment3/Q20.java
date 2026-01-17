package assignment3;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int i=0; i<n; i++)
			b[i]=sc.nextInt();
		int[] merge = new int[m+n];
		for(int i =0; i<n; i++)
			merge[i]=a[i];
		for(int i=n; i<m+n; i++)
			merge[i]=b[i-n];
		for(int i=0; i<m+n; i++)
			System.out.print(merge[i]+" ");
		sc.close();
	}

}
