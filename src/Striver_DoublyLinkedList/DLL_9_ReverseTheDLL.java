package Striver_DoublyLinkedList;

public class DLL_9_ReverseTheDLL {
	
	static Node convertArrayToDLL(int[] arr) {
		
		Node head = new Node(arr[0]);
		
		Node prev = head;	// prev itself is used as mover here :)
		
		for (int i = 1 ; i < arr.length ; i++) {
			Node temp = new Node(arr[i], null, prev);
			prev.next = temp;
			prev = temp;
		}
		
		return head;		
	}
	
	static Node reverseTheDLL(Node head) {
		
		if (head == null || head.next == null) {	// No element OR Single element
			return head;
		}
		
		Node prev = null;						// Init prev to null (Actually, its' null only)
												// That is before 'head'
			
		Node current = head;					// Like our 'temp' :)
		
		while (current != null) {				// Till the last (Till null)
			prev = current.back;				// Save the 'back' of current as prev (Swap starts)
			current.back = current.next;		// Assign next to back
			current.next = prev;				// Assign the save prev to next	(Swap ends)
			
			current = current.back;				// Navigate (Note .back Why? Ans: We swapped :))
		}
		
		return prev.back;						// This is going to be your new head.
												// Think this -> Had the array not reversed,
												// prev.next would be your last element
												// As it's reversed here, .back would be head
		
												// We cannot return 'current' as it's @ null
													
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		Node head = convertArrayToDLL(arr);
		
		head = reverseTheDLL(head);
		
		Node temp = head;
		
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}		

	}

}