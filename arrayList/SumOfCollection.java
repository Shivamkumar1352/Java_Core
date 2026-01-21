package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SumOfCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter no. of elements: ");
		n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			System.out.print("Enter the element at "+i+": ");
			a.add(sc.nextInt());
		}
		int sum = 0;
		Iterator<Integer> i = a.iterator();
		while(i.hasNext()) {
			sum+=i.next();
		}
		System.out.println("The sum of collection is: "+sum);
		sc.close();
	}

}
