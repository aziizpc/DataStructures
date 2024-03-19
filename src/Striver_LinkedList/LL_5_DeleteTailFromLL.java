package Striver_LinkedList;

public class LL_5_DeleteTailFromLL {
	
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
	
	private static Node deleteTailFromLL(Node head) {
		
		if (head == null || head.next == null) return null;
		
		Node temp = head;
		while (temp.next.next != null) {	// We need to stop @ second last. So this is the only way.
			temp = temp.next;				// .next
		}
		
		temp.next = null;					// Make the last node null (Draw and see. Will be easy.)
		
		return head;
	}

	public static void main(String[] args) {
		
		int[] arr = { 2, 5, 6, 8 };

		Node head = convertArrayToLL(arr);
		
		head = deleteTailFromLL(head);
		
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
