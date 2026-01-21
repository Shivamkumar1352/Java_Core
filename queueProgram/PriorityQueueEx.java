package queueProgram;
import java.util.PriorityQueue;
//import java.util.concurrent.ArrayBlockingQueue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		PriorityQueue<Object> q = new PriorityQueue<>();
		q.add(10);
		q.add(3);
		q.add(4);
		q.add(7);
		q.add(1);
		System.out.println(q);
		
		PriorityQueue<Object> q2 = new PriorityQueue<>();
		q2.offer(10);
		q2.offer(3);
		q2.offer(5);
		q2.offer(1);
		System.out.println(q2);
		
		
//		ArrayBlockingQueue<Object> al = new ArrayBlockingQueue<Object>(5);
		
		
	}
}
