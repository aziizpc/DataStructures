package Striver_LinkedList;

public class LL_14_OddEvenNodeLinkedList {
	
	static Node arrangeNodesAsOddEven(Node head) {
		
		if (head == null || head.next == null) return head;
		
		Node odd = head;
		Node even = head.next;
		Node evenHead = head.next;
		
		while (odd.next != null && even.next != null) {	// NOTE: The condition (Based on last jumps)
														// NOTE: It's AND -> Should break if at least one.next == null
			
			odd.next = odd.next.next;					// Jump twice
			even.next = even.next.next;					// Jump twice
			
			odd = odd.next;								// Jump once (As we already did twice above)
			even = even.next;							// Jump once (As we already did twice above)
		}
		
		odd.next = evenHead;							// Connect Odd to Even
		
		return head;
		
	}
	
	static Node convertArrayToLL(int[] arr) {

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
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		Node head = convertArrayToLL(arr);
		
		head = arrangeNodesAsOddEven(head);
		
		Node temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

	}

}
