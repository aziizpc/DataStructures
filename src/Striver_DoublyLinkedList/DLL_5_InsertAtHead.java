package Striver_DoublyLinkedList;

public class DLL_5_InsertAtHead {

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

	static Node insertAtHead(Node head, int k) {
		
		Node temp = new Node(k, head, null);
		
		head.back = temp;
		
		return temp;
		
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		Node head = convertArrayToDLL(arr);
		
		int k = 100;
		
		head = insertAtHead(head, k);
		
		Node temp = head;
		
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}		

	}

}