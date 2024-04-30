// LC - 1721

package MyLC_LinkedList;

public class LL_6_SwappingValuesOfNodesInALL {
	
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
	
	static Node swapNodes(Node head, int k) {		// Draw and learn. It's very eacsy.

        Node slow = head;							// slow @ head
        Node fast = head;							// fast @ head
        Node one = null;
        Node two = null;

        for (int i = 1 ; i <= (k-1) ; i++){			// Navigate fast till (k-1) --> Means, the first node
            fast = fast.next;
        }

        one = fast;									// Save that point as first

        while (fast.next != null){					// Now, navigate slow and fast UNTIL the LAST ELEMENT ONLY 
            slow = slow.next;
            fast = fast.next;
        }

        two = slow;									// Save the point

        int temp = one.data;
        one.data = two.data;
        two.data = temp;

        return head;
        
    }

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5};
		
		int k = 2;

		Node head = convertArrayToLL(arr);
		
		head = swapNodes(head, k);
		
		Node temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

	}

}