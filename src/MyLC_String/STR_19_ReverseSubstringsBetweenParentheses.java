// LC - 1190

package MyLC_String;

import java.util.Stack;

public class STR_19_ReverseSubstringsBetweenParentheses {
	
	public static String reverseParentheses(String s) {
		
		
		Stack<Integer> st = new Stack<Integer>();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0 ; i < s.length() ; i++) {
			
			char c = s.charAt(i);
			
			if (c == '(') {										// if c == '('
				st.push(sb.length());							// PUSH the sb length
			}
			
			else if (c == ')') {								// If c == ')'
				int start = st.pop();							// Get the start from STACK
				int end = sb.length() - 1;						// Get the end as sb.length() - 1 (Last char) 
				
				while (start < end) {							// while (start < end): 
					char ch = sb.charAt(start);					// Save char @ start
					sb.setCharAt(start++, sb.charAt(end));		// Set char @ start as that in end. Do start++.
					sb.setCharAt(end--, ch);					// Set char @ end to the one we saved. Do end--.
				}
			}
			
			else {												// For all others
				sb.append(c);									// Just append to sb
			}
			
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		String s = "(ed(et(oc))el)";
		
		System.out.println(reverseParentheses(s));

	}

}
