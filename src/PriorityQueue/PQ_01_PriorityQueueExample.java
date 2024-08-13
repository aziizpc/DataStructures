package PriorityQueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_01_PriorityQueueExample {

	public static void main(String[] args) {
		// Define a custom comparator to sort in descending order
		Comparator<Integer> reverseOrder = Collections.reverseOrder();

		// Create a PriorityQueue using the custom comparator
		PriorityQueue<Integer> queue1 = new PriorityQueue<>(10, reverseOrder); // Method 1

		// Add some elements to the queue
		queue1.add(5);
		queue1.add(10);
		queue1.add(2);
		queue1.add(8);

		// Print the elements of the queue in decreasing order
		while (!queue1.isEmpty()) {
			System.out.println(queue1.poll());
		}

		System.out.println("------------------------------------");

		PriorityQueue<Integer> queue2 = new PriorityQueue<>((a, b) -> (b - a)); // Method 2

		// Add some elements to the queue
		queue2.add(5);
		queue2.add(10);
		queue2.add(2);
		queue2.add(8);

		// Print the elements of the queue in decreasing order
		while (!queue2.isEmpty()) {
			System.out.println(queue2.poll());
		}

	}
}