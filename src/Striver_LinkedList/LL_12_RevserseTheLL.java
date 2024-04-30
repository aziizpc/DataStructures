package Striver_LinkedList;

public class LL_12_RevserseTheLL {

	private static Node convertArrayToLL(int[] arr) {

		Node head = new Node(arr[0]); 			// The Array 0th index would be the head
		Node mover = head; 						// Just declare a mover. Currently it points to head.

		for (int i = 1; i < arr.length; i++) { 	// Start from the 1st index
			Node temp = new Node(arr[i]); 		// Create temp nodes based on index
			mover.next = temp; 					// Connect the mover to temp :)
			mover = temp; 						// Now, the mover is @ temp.
		}
		return head;
	}
	
	static Node reverseTheLLRecursion(Node head) {
		if (head == null || head.next == null) return head;	// Base condition: No element OR One element
		
		Node newHead = reverseTheLLRecursion(head.next);	// Call the function recursively to get the newHead
															// newHead will be same throughout
															// What we are doing here is head.next @ each recursive call
															// Thereby head navigating forward in each call
		
		Node front = head.next;								// Basic (Save front)
		front.next = head;									// Reversing
		head.next = null;									// Obvious
		
		return newHead;
	}
	
	static Node reverseTheLL(Node head) {
		
		Node newHead = null;					// Assign the newHead as null (Important)
												// Assumption and valid also
		
		Node current = head;					// Just like 'temp'
		
		while (current != null) {				// Repeat until current != null
			
			Node front = current.next;			// Save the 'next' as 'front'. We need it later.
			
			current.next = newHead;				// Will change the 'current.next' to newHead.
												// Initial value of 'newHead' is null, right? :)
			
			newHead = current;					// Now, we set the newHead as current.
												// That is, it takes the next value.
			
			current = front;					// We now assign 'current' as front.
												// This is why we saved 'front' @ the beginning.
			
		}
		
		return newHead;
		
	}

	public static void main(String[] args) {

		int[] arr1 = { 2, 5, 6, 8 };
		
		Node head = convertArrayToLL(arr1);
		
		head = reverseTheLL(head);
		
		Node temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		
		System.out.println("\n----------------------------------------");
		
		int[] arr2 = { 2, 5, 6, 8 };
		
		head = convertArrayToLL(arr2);
		
		head = reverseTheLLRecursion(head);
		
		temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}	

	}

}