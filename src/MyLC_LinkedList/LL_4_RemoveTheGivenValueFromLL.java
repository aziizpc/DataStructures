// LC - 237
// Head not given

package MyLC_LinkedList;

public class LL_4_RemoveTheGivenValueFromLL {
	
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
	
	static void deleteNode(Node node) {			// Head is NOT provided to you. Only a node is provided.

		node.data = node.next.data;				// Set the node data to the data of the next node
		node.next = node.next.next;				// Set the next node to next.next
		
		// Basically, what we do here is ghosting the given node. We set its value as the value of the next node.
		// Also, give the pointer from that node as node.next.next.
		// Thus, the given 'node' becomes the 'successor node'. 

	}

	public static void main(String[] args) {
		
		int[] arr = { 2, 5, 6, 8, 10 };
		
		Node head = convertArrayToLL(arr);
		
		Node temp = head;
		
		Node node = temp.next.next;	// 6
		
		deleteNode(node);
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}


	}

}