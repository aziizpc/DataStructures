// LC - 503

package MyLC_Arrays;

import java.util.Arrays;
import java.util.Stack;

public class AML_19_NextGreaterElement {
	
	static int[] nextGreaterElements(int[] arr) {
		
		int n = arr.length;
		int[] ans = new int[n];
		
		Arrays.fill(ans, -1);
		
		Stack<Integer> st = new Stack<Integer>(); 
		
		for (int i = 0 ; i < 2 * n ; i++) {
			while ((!st.isEmpty()) && arr[st.peek()] < arr[i%n]) {
				ans[st.pop()] = arr[i%n];
			}
			st.push(i%n);			
		}
		return ans;		
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1 };
		
		int[] ans = nextGreaterElements(arr);
		
		System.out.println(Arrays.toString(ans));

	}

}