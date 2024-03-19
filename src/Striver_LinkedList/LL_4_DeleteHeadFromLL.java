package Striver_LinkedList;

public class LL_4_DeleteHeadFromLL {
	
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
	
	private static Node deleteHead(Node head) {
		
		if (head == null) return head;
		
		Node temp = head;		// Store the head as temp
		
		head = temp.next;		// Now, update the head as temp.next
		
		return head;			// Return head
		
	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 6, 8 };

		Node head = convertArrayToLL(arr);
		
		head = deleteHead(head);
		
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}