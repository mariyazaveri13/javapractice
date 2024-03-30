package collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Priority queue is used for heap data structure
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.offer(23);
		pq.offer(23);
		pq.offer(90);
		pq.offer(43);
		pq.offer(3);

		System.out.print(pq);
		
		pq.poll();
		System.out.print(pq);

		

	}

}
