package Striver_StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class STQ_3_ImplementStackUsingQueue {		// This program can written with similar methods as in STQ_2
	
	static Queue<Integer> q = new LinkedList<>();	// This is one of the ways of declaring a Queue
													// NOTE: ONLY ONE QUEUE IS REQUIRED FOR THIS PROBLEM
	
	public static void push(int x) {				// This is the method that you need to concentrate
		q.add(x);									// Push the given element
		for (int i = 0 ; i < q.size() - 1 ; i++) {
			q.add(q.peek());						// This & the next same as --> int a = q.poll(); q.add(a);
			q.poll();
		}
	}
	
	public static void pop() {
		q.poll();
	}
	
	public static int top() {
		return q.peek();
	}

	public static void main(String[] args) {
		
		push(1);
		push(2);
		push(3);
		System.out.println("Top element: " + top());
		pop();
		System.out.println("Top element: " + top());
		push(4);
		push(5);

	}

}