// LC - 2095
// Self

package Striver_LinkedList;

public class LL_22_DeleteMiddleNode {

	public Node deleteMiddle(Node head) {

		if (head == null || head.next == null)
			return null;

		Node before = null;								// Third variable
		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			before = slow;								// Set as 'slow'
			slow = slow.next;
			fast = fast.next.next;
		}

		before.next = slow.next;						// Rewire

		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}