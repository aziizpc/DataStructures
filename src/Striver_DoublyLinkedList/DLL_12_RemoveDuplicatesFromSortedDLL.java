package Striver_DoublyLinkedList;

public class DLL_12_RemoveDuplicatesFromSortedDLL {
	
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
	
	static Node removeDeplicates(Node head) {
		Node temp = head;
		
		while (temp.next != null) {					// Until the LAST ELEMENT only (That is, 'front' can go till null)
			
			Node front = temp.next;					// Save the front
			
			while (front != null && temp.data == front.data) {	// Navigate further if the values are same
				front = front.next;
			}
			
			temp.next = front;						// Connect next
			
			if (front != null) front.back = temp;	// Connect back (We will not 'back' from null)
			
			temp = front;							// Navigate (front is the new temp. My change instead of temp.next:))
		}		
		
		return head;
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 2, 2, 3, 3, 4, 5, 5, 6 };	// LL with duplicate data
		
		Node head = convertArrayToDLL(arr);
		
		Node temp = removeDeplicates(head);
		
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}