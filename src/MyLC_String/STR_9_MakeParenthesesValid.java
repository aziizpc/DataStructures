package MyLC_String;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class STR_9_MakeParenthesesValid {

	public static String validateTheString(String s) {

		Stack<Integer> st = new Stack<Integer>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (Character.isLetter(c)) {
				continue;
			} else if (c == '(') { // Push THE POS OF '('
				st.push(i);
			} else if (c == ')') {
				if ((!st.isEmpty()) && (s.charAt(st.peek()) == '(')) { // Pop '(' when its POSITION is @ top of
																		// top of non-empty Stack
					st.pop();
				} else // Else PUSH THE POS
					st.push(i);
			}
		}

		StringBuilder sb = new StringBuilder();
		Set<Integer> hs = new HashSet<Integer>(st); // Insert the Stack items to HashSet so that we can use 'contains'
													// function

		for (int i = 0; i < s.length(); i++) {
			if (!hs.contains(i)) {
				sb.append(s.charAt(i)); // Append all the characters if its index not present in the Set
			}
		}

		return sb.toString();

	}

	public static void main(String[] args) {
		String s = "(a(b(c)d)";

		System.out.println(validateTheString(s));

	}

}