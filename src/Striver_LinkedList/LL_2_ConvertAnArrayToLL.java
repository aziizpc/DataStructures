package Striver_LinkedList;

public class LL_2_ConvertAnArrayToLL {

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

	public static void main(String[] args) {

		int[] arr = { 2, 5, 6, 8 };
		
		Node head = convertArrayToLL(arr);
		
		System.out.println("Head: " + head.data);
		
		// Traversing the LL || Getting the length
		
		System.out.println("\nTraversal:");
		
		Node temp = head;	// Assign temp as head. Why? -> We SHOULD NOT TOUCH head after declaration.
		
		int count = 0;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
			count++;
		}
		
		System.out.println("\n\nSize of the LL: " + count);

	}

}