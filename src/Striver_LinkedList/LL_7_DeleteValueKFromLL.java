// Self

package Striver_LinkedList;

public class LL_7_DeleteValueKFromLL {

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

	private static Node deleteK(Node head, int k) { // Self

		if (head == null)
			return head;

		// k @ start itself:
		while (head.data == k)
			head = head.next;

		// k between head and tail:
		Node temp = head;
		Node prev = null;
		while (temp != null && temp.next.next != null) { // Navigate till the second last element (Considering
															// repetitions as well)
			if (temp.next.data == k) {
				temp.next = temp.next.next;
			}
			prev = temp;
			temp = temp.next;
		}

		// k @ tail:
		if (temp.data == k) {
			prev.next = null;
		}

		return head;

	}

	public static void main(String[] args) {

		int[] arr = { 5, 5, 2, 3, 5, 6, 5, 8, 5, 5, 5 };

		Node head = convertArrayToLL(arr);

		int k = 5;

		head = deleteK(head, k);

		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}