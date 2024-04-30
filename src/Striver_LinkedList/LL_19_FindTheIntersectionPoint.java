// LC - 160
// The question is to find an intersection node. it means when two nodes has next node and it node is common for both.

package Striver_LinkedList;

public class LL_19_FindTheIntersectionPoint {
	
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
	
	static Node getIntersectionNode(Node head1, Node head2) {
		
		// Note: We are finding intersecting node. (Not just two nodes with same value)
		
		Node temp1 = head1;						// Get head1 as temp1
		Node temp2 = head2;						// Get head2 as temp2
		
		while (temp1 != temp2) {				// while NOT EQUAL (Important)
			temp1 = temp1.next;					// Navigate (Note: We are navigating first. We are not checking if the first 'temp1' and 'temp2' are equal.)
			temp2 = temp2.next;					// Navigate (Note: We are navigating first. We are not checking if the first 'temp1' and 'temp2' are equal.)
			
			if (temp1 == temp2) return temp1;	// If the nodes are equal, return temp1 (Or temp2)
												// If intersecting, it will return that node
												// Else, it will return null (Which again is the intersecting point) as temp1 and temp2 can go up to null
			
			if (temp1 == null) temp1 = head2;	// temp1 reaches null => Jump to head2
			if (temp2 == null) temp2 = head1;	// temp2 reaches null => Jump to head1
			
			// Why we doing the above steps? -> It will compensate for the two LL size differences
		}
		
		return temp1;							// If the first values (temp1 and temp2) itself are equal.
												// That is, non-while-loop condition
		
	}

	public static void main(String[] args) {
		
		int[] arr1 = { 4, 1, 8, 4, 5 };
		int[] arr2 = { 5, 6, 1, 8, 4, 5 };
		
		// This program won't run as if we create two arrays, the LL will never intersect.
		// We need intersecting nodes
		// Learn the logic
		
		Node head1 = convertArrayToLL(arr1);
		Node head2 = convertArrayToLL(arr2); 
		
		Node intersectionNode = getIntersectionNode(head1, head2);
		
		System.out.println(intersectionNode.data);

	}

}