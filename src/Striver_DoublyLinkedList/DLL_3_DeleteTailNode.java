package Striver_DoublyLinkedList;

public class DLL_3_DeleteTailNode {

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

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		Node head = convertArrayToDLL(arr);
		
		if (head == null || head.next == null) {	// Start	(null or just 1 element)
			head = null;							// That is, return null in a function
		}
		
		Node temp = head;
		
		while (temp.next != null) {			// Navigate till the last
			temp = temp.next;
		}
		
		Node prev = temp.back;				// Second last element is set as 'prev'
		
		prev.next = null;					// prev.next is set to null (Disconnect)
		
		temp.back = null;					// End ('back' of last set as null (Disconnect))
		
		temp = head;
		
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}		

	}

}