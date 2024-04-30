package Striver_LinkedList;

public class LL_23_FindTheStartingPointOfTheLoop {
	
	public Node detectCycle(Node head) {

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){	// Tortoise & Hare loop
            slow = slow.next;						// Navigate
            fast = fast.next.next;					// Navigate

            if (slow == fast){						// Condition for loop
                slow = head;						// slow jumps to head
                while (slow != fast){				// Condition for the navigation
                    slow = slow.next;				// Navigate	
                    fast = fast.next;				// Navigate
                }
                return slow;						// Return slow or fast
            }
        }

        return null;								// Return null ==> No loop at all
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}