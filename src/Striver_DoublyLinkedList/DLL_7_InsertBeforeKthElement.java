package Striver_DoublyLinkedList;

public class DLL_7_InsertBeforeKthElement {

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
	
	static Node insertBeforeKthElement(Node head, int k, int val) {// There are more scenarios here
																   // k = 1; k @ tail		
		Node temp = head;
		
		int count = 1;
		
		while (temp.next != null) {
			temp = temp.next;
			count++;
			if (count == k) break;
		}
		
		Node prev = temp.back;	// Always find prev before creating the newNode
		
		Node newNode = new Node(val, temp, prev);
		
		prev.next = newNode;
		
		temp.back = newNode;
		
		return head;		
		
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		Node head = convertArrayToDLL(arr);
		
		int k = 3;
		
		int val = 100;
		
		head = insertBeforeKthElement(head, k, val);
		
		Node temp = head;
		
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}		

	}

}