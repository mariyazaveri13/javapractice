package collection;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		
		//implement stack and queue from this class as it is faster than linked list
		
		//stack implementation LIFO
		
		dq.offerLast(10);
		dq.offerLast(20);
		dq.offerLast(30);
		dq.offerLast(40);
		
		dq.pollLast();
		
		System.out.print(dq);
		
		
		System.out.println();
		
		ArrayDeque<Integer> dq2 = new ArrayDeque<Integer>();
		
		//implement stack and queue from this class as it is faster than linked list
		
		//queue implementation FIFO
		
		dq2.offerLast(10);
		dq2.offerLast(20);
		dq2.offerLast(30);
		dq2.offerLast(40);
		
		dq2.pollFirst();
		
		System.out.print(dq2);

	}

}
