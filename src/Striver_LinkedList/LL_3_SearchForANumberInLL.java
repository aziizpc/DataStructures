package Striver_LinkedList;

public class LL_3_SearchForANumberInLL {

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

	private static String searchInALL(Node head, int k) {
		Node temp = head;

		while (temp != null) {
			if (temp.data == k) {
				return "Found";
			}
			temp = temp.next;
		}
		return "Not found";
	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 6, 8 };

		Node head = convertArrayToLL(arr);
		
		System.out.println(searchInALL(head, 6));

	}

}