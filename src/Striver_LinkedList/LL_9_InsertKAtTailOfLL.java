// Self

package Striver_LinkedList;

public class LL_9_InsertKAtTailOfLL {
	
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
	
	private static Node insertKAtTail(Node head, int k) {
		
		Node temp = head;
		
		while (temp.next != null) {
			temp = temp.next;
		}
		
		Node last = new Node(k, null);
		
		temp.next = last;
		
		return head;
	}
	
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		Node head = convertArrayToLL(arr);
		
		int k = 100;
		
		head = insertKAtTail(head, k);
		
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}

}