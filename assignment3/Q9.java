package assignment3;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		int sum = 0;
		for(int i=0; i<n; i++)
			sum += a[i]%2==0?a[i]:0;
		System.out.println(sum);
		sc.close();
	}

}
