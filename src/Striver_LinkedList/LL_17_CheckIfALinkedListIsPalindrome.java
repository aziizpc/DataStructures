package Striver_LinkedList;

public class LL_17_CheckIfALinkedListIsPalindrome {
	
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
	
	static boolean checkPalindrome(Node head) {
		
		if (head ==null || head.next == null) return true;
		
		Node slow = head;
		Node fast = head;
		
		while (fast.next != null && fast.next.next != null) {	// NOTE: This will cover both odd and even scenarios
			slow = slow.next;
			fast = fast.next.next;
		}
		
		Node newHead = reverseTheLLRecursion(slow.next);	// Call the reverse function for 'slow.next'
															// Get the o/p as newHead
															// For 1->2->3->3->2->1->null, the output will be:
															// 1->2->3 1->2->3->null.
															// Side Note: Original 3->3 connection is still there (JustS)
		
		
		Node first = head;									// First section
		Node second = newHead;								// Second section
		
		while (second != null) {							// Traverse loop (1->2->3 1->2->3->null)
			if (first.data != second.data) {
				reverseTheLLRecursion(newHead);				// For reverting the changes you made
				return false;
			}
			first = first.next;
			second = second.next;
		}
		
		reverseTheLLRecursion(newHead);						// For reverting the changes you made
		
		return true;
				
	}
	
	static Node reverseTheLLRecursion(Node head) {
		if (head == null || head.next == null) return head;
		
		Node newHead = reverseTheLLRecursion(head.next);
														
		Node front = head.next;
		front.next = head;
		head.next = null;
		
		return newHead;
	}

	public static void main(String[] args) {
		
		int[] arr1 = { 1, 2, 3, 3, 2, 1 };	// Even
		
		Node head = convertArrayToLL(arr1);
		
		boolean flag = checkPalindrome(head);
		
		System.out.println(flag);
		
		System.out.println("\n----------------------------------------");
		
		int[] arr2 = { 1, 2, 3, 2, 1 };		// Odd
		
		head = convertArrayToLL(arr2);
		
		flag = checkPalindrome(head);
		
		System.out.println(flag);
		
		System.out.println("\n----------------------------------------");
		
		int[] arr3 = { 1, 2, 3, 3, 1 };		// False
		
		head = convertArrayToLL(arr3);
		
		flag = checkPalindrome(head);
		
		System.out.println(flag);

	}

}