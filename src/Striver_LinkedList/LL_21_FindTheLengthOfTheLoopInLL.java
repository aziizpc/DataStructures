package Striver_LinkedList;

import java.util.LinkedList;

public class LL_21_FindTheLengthOfTheLoopInLL {
	
	static int getLength(Node head) {
		
		Node slow = head;
		Node fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast) findLength(slow, fast);	// We will find a node where slow & fast are equal
														// If exists, findLength
			
		}
		
		return 0;
		
	}
	
	static int findLength(Node slow, Node fast) {
		
		int count = 1;									// Default size: 1
		
		fast = fast.next;								// Move fast one step forward 
														//so that we can work with the while loop next
		
		while (slow != fast) {							// Condition	
			count++;							
			fast = fast.next;							// Navigate
		}
		
		return count;									// Returns count
	}

	public static void main(String[] args) {
				

	}

}