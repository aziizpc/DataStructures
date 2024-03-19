package MyLC_LinkedList;

class Node {
	int data;
	Node next;

	Node(int data1, Node next1) {
		this.data = data1;
		this.next = next1;
	}

	Node(int data1) {
		this.data = data1;
		this.next = null;
	}
}

public class LL_1_MiddleOfLinkedList {
	
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

	public static Node getMiddleNode(Node head) {		// The method 
		
		Node slow = head;								// Init slow as head
		Node fast = head;								// Init fast as well as head
		
		while (fast != null && fast.next != null) {		// while loop. We need to make sure fast.next != null 
			slow = slow.next;							// Navigate slow
			fast = fast.next.next;						// Navigate fast
		}
		
		return slow;									// slow will be at middle

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		Node head = convertArrayToLL(arr);
		
		Node middle = getMiddleNode(head);
		
		System.out.println(middle.data);

	}

}