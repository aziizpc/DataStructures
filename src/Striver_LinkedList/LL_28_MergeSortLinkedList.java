package Striver_LinkedList;

public class LL_28_MergeSortLinkedList {

	public Node mergeTwoLists(Node l1, Node l2){	// Program to two sorted lists

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

    public static Node findMiddle(Node head){		// Tortoise and Hare with slight modification

    	Node slow = head;
    	Node fast = head.next;						// Like this as we want the first of two in case of even LL

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public Node sortList(Node head) {				// We need to call this function (Master)

        if (head == null || head.next == null) return head;	// Obvious --> Already sorted

        Node middle = findMiddle(head);				// Find the middle node
        Node right = middle.next;					// Next after middle is the right portion
        middle.next = null;							// Point the next after middle to null
        											// (So that we have two separate sections)
        Node left = head;							// left portion start is head only

        left = sortList(left);						// Recursive call
        right = sortList(right);					// Recursive call

        return mergeTwoLists(left, right);			// Call the Merge function
        											// UNLIKE ARRAY MERGE SORT, WE HAVE RETURN STATEMENT HERE!!
        
    }

}