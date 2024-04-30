package Striver_DoublyLinkedList;

public class DLL_10_DeleteAllOccurrencesOfAKeyInDLL {
	
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
	
	static Node deleteAllOccurrences(Node head, int k) {
		
		Node temp = head;
		
		while (temp != null) {					// TIll null
			if (temp.data == k) {				// Value matches
				if (temp == head) {				// If the node is head
					head = head.next;			// Just move the head
				}
				
				Node nextNode = temp.next;		// Get the next node as nextNode 
				Node prevNode = temp.back;		// Get the next node as prevNode
				
				if (nextNode != null) {			// If nextNode is NOT null (That is when temp is not last node) 
												// Note -> If null, we should NOT set back (It's one-way)
					nextNode.back = prevNode;	// Set nextNode's back as prevNode
				}
				
				if (prevNode != null) {			// If prevNode is NOT null (That is when temp is not head)
												// Note -> If null, we should not set next (It's again one-way)
					prevNode.next = nextNode;	// Set prevNode's next as nextNode
				}
				
				temp = temp.next;				// temp moves forward
			}
			
			else {
				temp = temp.next;				// Just move forward
			}
		}
		
		return head;
		
	}

	public static void main(String[] args) {
		
		int[] arr = { 10, 10, 2, 10, 10, 4, 10, 10 };
		
		Node head = convertArrayToDLL(arr);
		
		head = deleteAllOccurrences(head, 10);
		
		Node temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}	

	}

}