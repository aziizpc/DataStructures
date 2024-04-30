package Striver_LinkedList;

public class LL_16_DeleteNthNodeFromLast {
	
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
	
	static Node deleteNthNodeFromLast(Node head, int n) {
		
		Node fast = head;					// Save head as fast
		
		for (int i = 0 ; i < n ; i++) {		// Navigate the 'fast' till n (Starting from 0)
			fast = fast.next;
		}
		
		// System.out.println(fast.data);
		
		if (fast == null) return head.next;	// n reached null ==> nth node from last is head itself
		
		Node slow = head;					// Save head as slow
		
		while (fast.next != null) {			// Navigate slow and fast until fast reaches last element (Not null) 
			slow = slow.next;				
			fast = fast.next;
		}
		
		// Now, we have the slow @ the element right before the element to be removed
		
		slow.next = slow.next.next;			// Rewire :)
		
		return head;
	}

	public static void main(String[] args) {
		
		int[] arr = { 2, 1, 5, 7, 9, 0, 3 };
		
		Node head = convertArrayToLL(arr);
		
		int n = 3;
		
		head = deleteNthNodeFromLast(head, n);
		
		Node temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

	}

}