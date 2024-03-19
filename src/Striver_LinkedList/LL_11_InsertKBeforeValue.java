package Striver_LinkedList;

public class LL_11_InsertKBeforeValue {
	
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
	
	private static Node insertKBeforeValue(Node head, int k, int value) {
		
		if (head.data == value) {
			return new Node(k, head);
		}
		
		Node temp = head;
		
		while (temp != null && temp.next.data != value) {
			temp = temp.next;
		}
		
		Node y = new Node(k, temp.next);	// NOTE: Try to write this way always		
		temp.next = y;
		
		return head;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 6, 8, 9 };

		Node head = convertArrayToLL(arr);
		
		int k = 100;
		int value = 6;
		
		head = insertKBeforeValue(head, k, value);
		
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}