// LC - 25

package Striver_LinkedList;

public class LL_24_ReverseNodesInKGroupSizeOfLL {
	
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
	
	static Node reverseNodesInGroup(Node head, int k) {
		
		Node temp = head;
		Node nextNode = null;					// For the next section
		Node prevNode = null;					// For saving the last node in the section which is just reversed
		
		while (temp != null) {
			Node kthNode = findKthNode(temp, k);
			
			if (kthNode == null) {				// True ==> The section has less than k elements (See function)				
				if (prevNode != null) {			// There can be LL with total nodes less than k
												// That is, prevNode is NEVER set for this LL
												// For others:
					prevNode.next = temp;		// Connect the previous section last element to current element
					break;						// Break as there can be no more sections
				}
				
				else return head;				// There are < k nodes ==> No need to do anything
			}
			
			nextNode = kthNode.next;			// Save the first node of next section (For future use)
			kthNode.next = null;				// Assign the last node of current section to null
												// This is required for reversal so that only that section nodes
												// get reversed
			
			reverseTheLLRecursion(temp);		// Call the reverse function (Just call. No assignment)
			
			if (temp == head) head = kthNode;	// temp == head ==> This is the first section
			
			else {
				prevNode.next = kthNode;		// This condition will be executed starting from the second section only
												// Makes sure that the last element in the previous section
												// is connected to the first element of the current section
												// after reversal (That is, previous last to current 'kthNode').
			}
			
			prevNode = temp;					// Saving the last node of a section so that we can connect
												// it to first node of next section
			
			temp = nextNode;					// Jump to next section
		}
		
		return head;
		
	}
	
	static Node findKthNode(Node temp, int k) {
		int cnt = 1;
		
		while (temp != null) {
			temp = temp.next;
			cnt++;
			if (cnt == k) return temp;
		}
		
		return null;
	}
	
	static Node reverseTheLLRecursion(Node head) {
		if (head == null || head.next == null) return head;	// Base condition: No element OR One element
		
		Node newHead = reverseTheLLRecursion(head.next);																
		
		Node front = head.next;								
		front.next = head;									
		head.next = null;									
		
		return newHead;
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		
		Node head = convertArrayToLL(arr);
		
		int k = 3;
		
		Node temp = reverseNodesInGroup(head, k);
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}		

	}

}