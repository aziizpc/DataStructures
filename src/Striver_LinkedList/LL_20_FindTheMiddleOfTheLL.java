package Striver_LinkedList;

public class LL_20_FindTheMiddleOfTheLL {
	
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
	
	static Node findMiddle(Node head) {
		Node fast = head;
		Node slow = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}

	public static void main(String[] args) {
		
		int[] arr1 = { 2, 5, 6, 8 };
		
		Node head = convertArrayToLL(arr1);
		
		Node middle = findMiddle(head);
		
		System.out.println(middle.data);
		
		System.out.println("-------------");
		
		int[] arr2 = { 2, 5, 3, 6, 8 };
		
		head = convertArrayToLL(arr2);
		
		middle = findMiddle(head);
		
		System.out.println(middle.data);

	}

}