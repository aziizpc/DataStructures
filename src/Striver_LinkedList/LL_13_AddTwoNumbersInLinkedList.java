package Striver_LinkedList;

public class LL_13_AddTwoNumbersInLinkedList {
	
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
	
	static Node getSum(Node head1, Node head2) {
		
		Node temp1 = head1;
		Node temp2 = head2;
		
		Node dummyNode = new Node(-1);
		Node current = dummyNode;
		
		int carry = 0;
		
		while (temp1 != null || temp2 != null) {
			
			int sum = carry;
			
			if (temp1 != null) {
				sum+= temp1.data;
			}
			
			if (temp2 != null) {
				sum+= temp2.data;
			}
			
			Node nextSumNode = new Node(sum % 10, null);
			
			carry = sum / 10;
			
			/* Better way:
			 * 
			 * 		if (sum > 9) {
                		carry = 1;
                		sum = sum % 10;
            		}
            		else {
                		carry = 0;
            		}
			 * 
			 */
			
			current.next = nextSumNode;
			
			current = nextSumNode;
			
			if (temp1 != null) {
				temp1 = temp1.next;
			}
			
			if (temp2 != null) {
				temp2 = temp2.next;
			}			
			
		}
		
		if (carry != 0) {
			Node nextSumNode = new Node(carry, null);			
			current.next = nextSumNode;			
		}
		
		return dummyNode.next;
		
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4 };		
		Node head1 = convertArrayToLL(arr1);
		
		int[] arr2 = { 4, 3, 2, 1, 0, 0 };		
		Node head2 = convertArrayToLL(arr2);
		
		Node sumHead = getSum(head1, head2);
		
		Node temp = sumHead;
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

	}

}