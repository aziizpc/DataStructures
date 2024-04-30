// LC - 141

package MyLC_LinkedList;

public class LL_5_LinkedListCycle {
	
	static boolean hasCycle(Node head) {

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;		// THIS IS THE KEY (This will be AN element within the cycle)
        }

        return false;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}