// Self :)
// Check AML_19 as well (Lee method)

package Striver_StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class STQ_6_NextGreaterElement {

	static int[] getNextGreaterElement(int[] arr) {		// The ORIGINAL FUNCTION

		Stack<Integer> st = new Stack<Integer>();		// Created a Stack

		int[] ans = new int[arr.length];				// Answer array

		for (int i = arr.length - 1; i >= 0; i--) {		// For Loop from last element of the array

			int num = arr[i];							// Stored the current value as 'num'

			while (!st.isEmpty()) {						// While the stack IS NOT EMPTY:
				int val = st.peek();					// We check if the PEEK VALUE is less than num
				if (val <= num) {						// If yes, we will KEEP popping it
					st.pop();							// If no, we will break out of the loop
				} else
					break;
			}

			if (!st.isEmpty())							// Now, if the Stack is NOT EMPTY, the pop value
				ans[i] = st.peek();						// is set as the NEXT GREATER ELEMENT for that index

			else										// Else, we are setting -1
				ans[i] = -1;

			st.push(num);								// In all the cases, we push num to the Stack

		}

		return ans;

	}

	static int[] getNextGreaterElementCircular(int[] arr) {	// Generalizing for both normal as well as circular 

		Stack<Integer> st = new Stack<Integer>();
		
		int n = arr.length;

		int[] ans = new int[arr.length];

		for (int i = 2 * n - 1; i >= 0; i--) {				// (n - 1) for NORMAL; (2 * n - 1) for CIRCULAR 

			int num = arr[i % n];							// Change i to i % n

			while (!st.isEmpty()) {
				int val = st.peek();
				if (val <= num) {
					st.pop();
				} else
					break;
			}

			if (!st.isEmpty())
				ans[i % n] = st.peek();						// Change i to i % n

			else
				ans[i % n] = -1;							// Change i to i % n

			st.push(num);

		}

		return ans;

	}

	public static void main(String[] args) {

		int[] arr = { 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };

		System.out.println(Arrays.toString(getNextGreaterElement(arr)));
		
		System.out.println(Arrays.toString(getNextGreaterElementCircular(arr)));

	}

}
