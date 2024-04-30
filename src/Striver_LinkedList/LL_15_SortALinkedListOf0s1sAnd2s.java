package Striver_LinkedList;

public class LL_15_SortALinkedListOf0s1sAnd2s {
	
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
	
	static Node sortLinkedList(Node head) {
		
		if (head == null || head.next == null) return head;	// null case
		
		Node zeroHead = new Node (-1);						// Created a new dummy node for '0s'
		Node oneHead = new Node (-1);						// Created a new dummy node for '1s'
		Node twoHead = new Node (-1);						// Created a new dummy node for '2s'
		
		Node zero = zeroHead;								// Create a new node (Like temp) that points to zeroHead
		Node one = oneHead;									// Create a new node (Like temp) that points to oneHead
		Node two = twoHead;									// Create a new node (Like temp) that points to twoHead
		
		Node temp = head;									// Normal 'temp'
		
		while (temp != null) {								// Until temp has the value null
			if (temp.data == 0) {							// If the data is 0
				zero.next = temp;							// Set the next node to 'zero' as the current node (temp)
				zero = zero.next;							// Navigate
			}
			else if (temp.data == 1) {						// If the data is 1
				one.next = temp;							// Set the next node to 'one' as the current node (temp)
				one = one.next;								// Navigate
			}
			else {											// If the data is 2
				two.next = temp;							// Set the next node to 'two' as the current node (temp)
				two = two.next;								// Navigate
			}
			temp = temp.next;								// Navigate the temp (See while loop)
		}
		
		// Now, we need to connect the three LLs based on zeroHead.next, oneHead.next & twoHead.next.
		// But, there are various cases here. E.g.: We have only 1; Only 1 & 2, Only 1 & 3, Only 2, Only 3, Only 2 & 3, etc
		
		zero.next = (oneHead.next != null) ? (oneHead.next) : (twoHead.next);
		// That is, check if there are any 1s. How do we check that? Ans: oneHead.next != null :)
		// If 1s is/are there, the  zero.next = oneHead.next
		// If no, twoHead.next
		// You may think what if 2s are also not there. How the above will be correct.
		// Ans: twoHead.next will cover all the scenarios. That is, makes zero.next points to null if there are 
		// no 2s. If there are 2s, points to that particular node
		// It works fine why because 2 is the maximum possible element 
		
		
		one.next = twoHead.next;
		// Connects one.next to twoHead.next.
		// If 1s and 2s there -> Fine (Straightforward)
		// If 1s there and 2s not there -> Fine (As it will eventually be pointed to null)
		// If 1s not there and 2s there -> Fine (null points to some node with value 2. Makes no difference overall.)
		// If no 1s and 2s -> Fine (As null points to null and makes no difference overall)
		
		
		two.next = null;
		// This is obvious
		// This program should work just fine if you comment or uncomment this line.
		
		Node newHead = zeroHead.next;
		
		return newHead;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 0, 0, 2, 1, 1, 0, 0, 0, 2, 1, 2, 1, 1, 0, 1, 2 };
		
		Node head = convertArrayToLL(arr);
		
		head = sortLinkedList(head);
		
		Node temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}

}