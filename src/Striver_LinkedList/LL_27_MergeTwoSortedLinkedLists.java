package Striver_LinkedList;

public class LL_27_MergeTwoSortedLinkedLists {
	
	public Node mergeTwoLists(Node l1, Node l2){

		if(l1 == null) return l2;
		if(l2 == null) return l1;

		if (l1.data <= l2.data){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}