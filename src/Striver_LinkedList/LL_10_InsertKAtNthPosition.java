// Self

package Striver_LinkedList;

public class LL_10_InsertKAtNthPosition {

	private static Node convertArrayToLL(int[] arr) {

		Node head = new Node(arr[0]);
		Node mover = head;

		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}

	private static Node insertAtN(Node head, int k, int n) {	// Self

		if (n == 1) {						// Case: Insert as head
			return new Node(k, head);
		}

		int count = 0;

		Node temp = head;

		while (temp != null) {				// Case: All others
			count++;
			if (count == (n - 1)) {
				Node newNode = new Node(k);
				newNode.next = temp.next;
				temp.next = newNode;
				return head;
			}
			temp = temp.next;
		}

		return head;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 6, 8, 9 };

		Node head = convertArrayToLL(arr);

		int k = 100;
		int n = 4;

		head = insertAtN(head, k, n);

		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
