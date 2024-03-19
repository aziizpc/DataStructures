package Striver_DoublyLinkedList;

public class DLL_2_DeleteHeadNode {

static Node convertArrayToDLL(int[] arr) {
		
		Node head = new Node(arr[0]);
		
		Node prev = head;
		
		for (int i = 1 ; i < arr.length ; i++) {
			Node temp = new Node(arr[i], null, prev);
			prev.next = temp;
			prev = temp;
		}
		
		return head;		
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		Node head = convertArrayToDLL(arr);
		
		if (head == null || head.next == null) {	// Start	(null or just 1 element)
			head = null;							// That is, return null in a function
		}
		
		Node prev = head;							// Save current head as prev
		
		head = head.next;							// Disconnect
		
		head.back = null;							// Disconnect
		
		prev.next = null;							// End (Disconnect)		
		
		Node temp = head;
		
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}	

	}

}