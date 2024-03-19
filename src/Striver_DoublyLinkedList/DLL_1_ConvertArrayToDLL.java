// while(temp != null) ==> Goes till null @ the end
// while(temp.next != null) ==> Goes till the last element
// while(temp.next.next != null) ==> Goes till the second last element AND SO ON


package Striver_DoublyLinkedList;

class Node {
	
	int data;
	Node next;
	Node back;
	
	Node(int data1, Node next1, Node back1){
		this.data = data1;
		this.next = next1;
		this.back = back1;
	}
	
	Node(int data1){
		this.data = data1;
		this.next = null;
		this.back = null;
	}
	
}

public class DLL_1_ConvertArrayToDLL {
	
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
		
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}		

	}

}