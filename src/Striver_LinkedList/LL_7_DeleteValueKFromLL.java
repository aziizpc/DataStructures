// Self

package Striver_LinkedList;

public class LL_7_DeleteValueKFromLL {
	
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
	
	private static Node deleteK(Node head, int k) {
		
		if (head == null) return head;
		
		if (head.data == k) {	// Case: The first element itself is k
			Node temp = head;
			while (temp.data == k) {	// We need to handle repetitive k @ first
				temp = temp.next;		// Note
			}
			head = temp;				// Assign temp to head after the movement(s)
		}
		
		Node temp = head;
		Node prev = null;
		while (temp != null && temp.next != null) {	// Case; k anywhere between head and tail. Note while.
			if (temp.next.data == k) {
				prev = temp;
				prev.next = prev.next.next;
			}
			temp = temp.next;
		}
		
		if (temp.data == k) {	// To handle the k at tail.  
			prev.next = null;
		}
		
		return head;		
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 5, 5, 2, 3, 5, 6, 5, 8, 5, 5, 5 };
		
		Node head = convertArrayToLL(arr);
		
		int k = 5;
		
		head = deleteK(head, k);
		
		Node temp = head;
		while (temp != null) {	// Printing
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}