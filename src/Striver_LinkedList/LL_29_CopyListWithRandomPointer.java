// LC - 138
// Self :)

package Striver_LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode random;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class LL_29_CopyListWithRandomPointer {
	
	public ListNode copyRandomList(ListNode head) {			// Master function
        if (head == null) return null;
        head = addNodesInBetween(head);
        head = connectRandom(head);
        return separateOutTheCopyLL(head);
    }

    public static ListNode addNodesInBetween(ListNode head){// Function that add new node between existing nodes
    	ListNode temp = head;
        while (temp != null){
        	ListNode newNode = new ListNode(temp.val);		// Created the node
            newNode.next = temp.next;						// Re-wiring
            temp.next = newNode;							// Re-wiring
            temp = temp.next.next;							// Navigate
        }
        return head;
    }

    public static ListNode connectRandom(ListNode head) {	// Make 'random' connections
    	ListNode temp = head;
        while (temp != null){
        	ListNode randomOfTemp = temp.random;			// Get the random of temp
        	ListNode nextToRandomOfTemp = null;				// nextToRandomOfTemp initialized
            if (randomOfTemp != null){
                nextToRandomOfTemp = randomOfTemp.next;		// Get next to randomOfTemp
            }            
            temp.next.random = nextToRandomOfTemp;			// Set random for the newly created node(s)
            temp = temp.next.next;							// Navigate
        }
        return head;
    }

    public static ListNode separateOutTheCopyLL(ListNode head){// Function to separate out both the LLs
    	ListNode temp = head;
    	ListNode newHead = temp.next;						// This will be the output head

        while (temp != null){
        	ListNode newNode = temp.next;					// Save the newly created node
        	ListNode nextOfInsertedNode = newNode.next;		// Save the next of newNode
        	ListNode frontNode = null;						// Initiate the front node (To re-wire the copy LL)
            if (nextOfInsertedNode != null){
                frontNode = nextOfInsertedNode.next;		// Get the front node
            }
            temp.next = nextOfInsertedNode;					// Re-wire
            newNode.next = frontNode;						// Re-wire
            temp = temp.next;								// Navigate
        }
        return newHead;
    }

}