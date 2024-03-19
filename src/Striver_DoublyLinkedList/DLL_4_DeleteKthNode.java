package Striver_DoublyLinkedList;

public class DLL_4_DeleteKthNode {
	
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
		
		Node temp = head;
		
		int k = 3;								// Start (Other scenarios not covered here. THINK!)
												// Oth: 1. No prev & no front (One element)
												// 2. No front (Tail)
		int i = 0;							
		
		while (temp != null) {
			i++;
			if (i == k) break;
			temp = temp.next;
		}
		
		Node prev = temp.back;						
		
		Node front = temp.next;
		
		prev.next = temp.next;						// Disconnect
		
		front.back = prev;							// Stitch
		
		temp.back = null;
		
		temp.next = null;							// End (NOTE: COnsider ALL SCENARIOS AS WELL)
		
		temp = head;		
		
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		

	}

}