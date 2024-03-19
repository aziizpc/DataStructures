package Striver_LinkedList;

public class LL_8_InsertKAtHeadOfLL {
	
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
	
	private static Node insertAtHead(Node head, int k) {
		
		return new Node(k, head);	// NOTE !!	<Just this line is enough. Check the constructor>
		
	}

	public static void main(String[] args) {
		
		int[] arr = { 2, 5, 6, 8 };
		
		Node head = convertArrayToLL(arr);
		
		int k = 9;
		
		head = insertAtHead(head, k);
		
		Node temp = head;
		while (temp != null) {	// Printing
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}