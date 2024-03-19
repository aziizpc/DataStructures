package Striver_DoublyLinkedList;

public class DLL_8_InsertBeforeANode {

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
	
	static void insertBeforeANode(Node node, int val) {	// NOTE: 'Node node' given as input
														// No loops here
														// Create and connect. That's it :)
		Node prev = node.back;
		
		Node newNode = new Node(val, node, prev);
		
		prev.next = newNode;
		
		node.back = newNode;
		
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		Node head = convertArrayToDLL(arr);
		
		insertBeforeANode(head.next.next, 100);	// See param wrt head
		
		Node temp = head;
		
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}		

	}

}