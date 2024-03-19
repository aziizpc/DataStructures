// Self

package Striver_LinkedList;

public class LL_10_InsertKAtNthPosition {
	
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
	
	private static Node insertAtN(Node head, int k, int n) {
		
		Node temp = head;
		
		if (n == 1) {
			return new Node(k, head);
		}
		
		int pos = 0;
		while (temp != null) {
			pos++;
			if (pos == n - 1) {
				Node y = new Node(k);
				y.next = temp.next;
				temp.next = y;				
			}
			temp = temp.next;
		}
		
		return head;
		
	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 6, 8, 9 };

		Node head = convertArrayToLL(arr);
		
		int k = 100;
		int n = 4;
		
		head = insertAtN(head, k, n);
		
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
