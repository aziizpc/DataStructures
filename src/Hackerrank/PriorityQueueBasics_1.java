package Hackerrank;

import java.util.*;

public class PriorityQueueBasics_1 {

	public static void main(String args[]) {

		PriorityQueue<String> cities_queue = new PriorityQueue<String>();
		
		// initialize the PriorityQueue with values
		cities_queue.add("Sydney");
		cities_queue.add("Venice");
		cities_queue.add("New York");
		cities_queue.add("California");
		cities_queue.add("Barcelona");
		cities_queue.add("Melbourne");
		
		// print the head of the PriorityQueue
		System.out.println("PriorityQueue Head: " + cities_queue.element());
		
		// Define the iterator for PriorityQueue and print its elements
		System.out.println("\nPriorityQueue contents: ");
		
		Iterator<String> iter = cities_queue.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}