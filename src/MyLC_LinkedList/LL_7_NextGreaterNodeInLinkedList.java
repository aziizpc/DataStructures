// LC - 1019
// Exactly similar to MyLC_Arrays : AML_19

package MyLC_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LL_7_NextGreaterNodeInLinkedList {
	
	public int[] nextLargerNodes(Node head) {

        Node temp = head;
        int n = 0;

        List<Integer> al = new ArrayList<Integer>();
        
        while (temp != null){
            al.add(temp.data);
            n++;
            temp = temp.next;
        }

        int[] ans = new int[n];
        Arrays.fill(ans, 0);

        temp = head;

        Stack<Integer> st = new Stack<Integer>();

        for (int i = 0 ; i < n ; i++){
            while ((!st.isEmpty()) && al.get(st.peek()) < al.get(i)){
                ans[st.pop()] = al.get(i);
            }
            st.push(i);
        }

        return ans;

    }

}