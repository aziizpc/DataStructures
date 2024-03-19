package Striver_LinkedList;

public class LL_6_DeleteKthElementInLL {
	
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
	
	private static Node deleteKthElement(Node head, int k) {
		
		if (head == null) return head;	// Case: null
		
		if (k == 1) {					// Case: Delete head
			Node temp = head;
			head = temp.next;
			return head;
		}
		
		int count = 0;					// Case: All others
		
		Node temp = head;
		while (temp != null && count != k) {
			count++;
			if (count == k - 1) {	// Here is where 'prev' is
				Node prev = temp;
				prev.next = prev.next.next;	// This!!
			}
			temp = temp.next;
		}
		
		return head;	
		
	}

	public static void main(String[] args) {
		
		int[] arr = { 2, 5, 6, 8 };
		
		Node head = convertArrayToLL(arr);
		
		int k = 3;	// k starts from 1
		
		head = deleteKthElement(head, k);
		
		Node temp = head;
		while (temp != null) {	// Printing
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}