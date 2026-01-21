package queueProgram;
import java.util.ArrayDeque;
public class ArrayDequeEx {
	public static void main(String[] args) {
		
		ArrayDeque<Object> a= new ArrayDeque<>();
		a.offer(10);
		a.offer(20);
		a.offer(30);
		a.offer(40);
		System.out.println(a);
		
		a.offerFirst(5);
		System.out.println(a);
		
		a.offerLast(10);
		System.out.println(a);
		
		a.poll();
		System.out.println(a);
		
		a.pollFirst();
		System.out.println(a);
		
		a.pollLast();
		System.out.println(a);
		
	}
}
