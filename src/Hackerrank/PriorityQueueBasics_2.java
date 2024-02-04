package Hackerrank;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueBasics_2 {
	
	public static void main(String args[]) {
		
		// Creating empty priority queue
		PriorityQueue<String> numQueue = new PriorityQueue<String>();
		
		// add elements to numQueue using add()
		numQueue.add("Five");
		numQueue.add("One");
		numQueue.add("Seven");
		numQueue.add("Three");
		numQueue.add("Eleven");
		numQueue.add("Nine");

		// Print the head element using Peek () method
		System.out.println("Head element using peek method: " + numQueue.peek());

		// Printing all elements
		System.out.println("\n\nThe PriorityQueue elements: ");
		numQueue.forEach(System.out::println);

		// remove head with poll ()
		numQueue.poll();
		System.out.println("\n\nAfter removing an element with poll function: ");
		numQueue.forEach(System.out::println);

		// Remove 'Three' using remove ()
		numQueue.remove("Three");
		System.out.println("\n\nElement 'Three' with remove function: ");
		numQueue.forEach(System.out::println);

		// Check if an element is present in PriorityQueue using contains()
		boolean ret_val = numQueue.contains("Five");
		System.out.println("\n\nPriority queue contains 'Five' " + "or not?: " + ret_val);

		// get array equivalent of PriorityQueue with toArray ()
		Object[] numArr = numQueue.toArray();
		System.out.println("\nArray Contents: ");
		for (int i = 0; i < numArr.length; i++)
			System.out.print(numArr[i].toString() + " ");
	}
}