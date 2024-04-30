package Striver_LinkedList;

public class LL_18_Add1ToANumberRepresentedByLL {
	
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
	
	static Node addOne(Node head) {
		
		int carry = helper(head);			// Call the Helper function to get the FINAL CARRY
		
		if (carry == 1) {					// If 1
			Node newNode = new Node(1);		// Create a new node
			newNode.next = head;			// The new node will be the head
			return newNode;			
		}
		
		else return head;					// If 0, just return the head
	}
	
	static int helper(Node temp) {			// Helper function
		if (temp == null) return 1;			// Base condition: When reaches null, returns 1 (Carry: Our Add 1)
		
		int carry = helper(temp.next);		// Drilling down (Recursive calls happen here)
		
		temp.data += carry;					// Just add (Think from null and back)
		
		if (temp.data < 10) return 0;		// Value less than 10 ==> No carry (No change in temp.data)
		
		else {								// Else
			temp.data = 0;					// Set data as 0 (temp.data changed)
			return 1;						// Return carry as 1
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr1 = { 2, 5, 6, 8 };
		
		Node head = convertArrayToLL(arr1);
		
		head = addOne(head);
		
		Node temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		
		System.out.println("\n--------------------------");
		
		int[] arr2 = { 9, 9, 9, 9 };
		
		head = convertArrayToLL(arr2);
		
		head = addOne(head);
		
		temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

	}

}