package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AccessElement {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		for(Object o: al) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		
		//Iterator
		Iterator<Object> i = al.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
		//Reverse ListIterator
		ListIterator<Object> j = al.listIterator();
		while(j.hasNext())
			j.next();
		while(j.hasPrevious())
			System.out.print(j.previous()+" ");
		System.out.println();
		
		
		//Half reverse
		int mid = al.size()/2;
		ListIterator<Object> k = al.listIterator(mid);
		while(k.hasPrevious()) {
			System.out.print(k.previous()+" ");
		}
		k = al.listIterator(mid);
		while(k.hasNext()) {
			System.out.print(k.next()+" ");
		}
		
	}
}
