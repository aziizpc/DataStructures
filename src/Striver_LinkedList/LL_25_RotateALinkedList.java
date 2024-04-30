package Striver_LinkedList;

public class LL_25_RotateALinkedList {
	
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
	
	static Node rotateLL(Node head, int k) {
		
		if (head == null || k == 0) return head;	// OK
		
		int cnt = 1;								// Counter to check the size of the LL
		Node tail = head;							// Navigate tail till the last element to get the size:
		
		while (tail.next != null) {
			tail = tail.next;
			cnt++;
		}
		
		if (k % cnt == 0) return head;				// If k is divisible by cnt ==> No need to rotate => return
		
		k = k % cnt;								// Get k % cnt as k
		
		tail.next = head;							// Connect the tail (Last node) to head [Loop created]
		
		Node newLastNode = findNthNode(head, cnt - k); // Now, we need to find the Node @ 'cnt - k' position
													// That is, if the LL size if 5 and if we want to rotate 3,
													// (5 - 3)th node from the head will be the new last node.
		
		head = newLastNode.next;					// The node that comes after newLastNode will obviously
													// be the head node. Save it as head.
		
		newLastNode.next = null;					// Point the newLastNode to null.
		
		return head;								// Return head
		
	}
	
	static Node findNthNode(Node temp, int lastNodePos) {	// To find the new last (tail) node
		
		int cnt = 1;									// Counter
		
		while (true) {									// while true (Self) is suitable here. Why?
														// We already know the LL size is say 5 and k is 3
														// We need to find (5-3)th, ie, 2nd node which is not
														// impossible and so the loop will surely return.
			if (cnt == lastNodePos) return temp;
			cnt++;
			temp = temp.next;
		}
		
		//return temp;									// Unreachable code because 'while true' statement
		
	}

	public static void main(String[] args) {
		
		int[] arr = { 2, 5, 6, 8, 10};
		
		Node head = convertArrayToLL(arr);
		
		int k = 4;
		
		Node temp = rotateLL(head, k);
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

	}

}