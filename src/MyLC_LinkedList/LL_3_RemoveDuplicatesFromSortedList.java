package MyLC_LinkedList;

public class LL_3_RemoveDuplicatesFromSortedList {
	
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
	
	static Node deleteDuplicates(Node head) {

        Node newNode = new Node(-1);			// Create a new node

        Node newHead = newNode;					// Save the newNode head

        Node temp = head;						// temp :)

        int curVal = Integer.MIN_VALUE;			// We need a variable to store current value

        while (temp != null){					// Till null
            int newValue = temp.data;			// Get new value
            if (newValue != curVal){			// Compare and see if they are different
                Node ln = temp;					// Save temo as ln
                newNode.next = ln;				// newNode pointed to ln 
                newNode = ln;					// ln is the new newNode
                curVal = newValue;				// new Value is the current Value now
            }
            temp = temp.next;					// Navigate
        }

        newNode.next = null;					// This is important. Else the existing connection and the end will prevail.
        										// Comment and check

        return newHead.next;
        
    }

	public static void main(String[] args) {
		
		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3 };
		
		Node head = convertArrayToLL(arr);
		
		head = deleteDuplicates(head);
		
		Node temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

	}

}