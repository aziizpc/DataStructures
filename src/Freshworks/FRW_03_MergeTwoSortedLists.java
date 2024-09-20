package Freshworks;

class Node {
	int data;
	Node next;

	Node(int data1, Node next1) {
		this.data = data1;
		this.next = next1;
	}

	Node(int data1) {
		this.data = data1;
		this.next = null;
	}
}

public class FRW_03_MergeTwoSortedLists {

	public Node mergeTwoLists(Node l1, Node l2) {
		
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		
		if (l1.data <= l2.data) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}
		
		else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}

	}

	public static void main(String[] args) {
		

	}

}
