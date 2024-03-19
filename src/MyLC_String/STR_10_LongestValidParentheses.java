// LC-32

package MyLC_String;

import java.util.Stack;

public class STR_10_LongestValidParentheses {

	public static int getLongestValidParntheses(String s) {

		Stack<Integer> st = new Stack<Integer>();

		int n = s.length();

		// Steps to find invalid parentheses follows

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);

			if (c == '(')
				st.push(i);

			else {
				if ((!st.isEmpty()) && s.charAt(st.peek()) == '(')
					st.pop();
				else
					st.push(i);
			}
		}

		// stack is empty ==> The entire string is valid.
		
		// Else, we set the longest = 0 ; end = n (As we are starting from the end of
		// the string because that's the order in which we inserted the invalid
		// characters in to the array first)
		
		// Get the start from the Stack pops
		
		// We check the length of each intervals and update the 'longest'
		
		// One check after the while loop to cover the portion from index=0 to the last stack pop

		if (st.isEmpty())
			return n;

		int longest = 0;
		int currentEnd = n;
		int currentStart = 0;

		while (!st.isEmpty()) {
			currentStart = st.pop();
			longest = Math.max(longest, currentEnd - currentStart - 1);
			currentEnd = currentStart;
		}
		longest = Math.max(longest, currentEnd - 0);

		return longest;

	}

	public static void main(String[] args) {
		String s = ")()())";

		System.out.println(getLongestValidParntheses(s));

	}

}