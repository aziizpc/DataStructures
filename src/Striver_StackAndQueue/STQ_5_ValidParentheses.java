package Striver_StackAndQueue;

import java.util.Stack;

public class STQ_5_ValidParentheses {

	static boolean areBracketsBalanced(String s) {
		
		Stack<Character> myStack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c == '(' || c == '[' || c == '{') {
				myStack.push(c);
				continue;
			}
			
			else {
				if (myStack.isEmpty()) return false;
				
				char toCheckAfterPopping;
				switch (c) {
				case ')':
					toCheckAfterPopping = myStack.pop();
					if (toCheckAfterPopping == '{' || toCheckAfterPopping == '[')
						return false;
					break;

				case '}':
					toCheckAfterPopping = myStack.pop();
					if (toCheckAfterPopping == '(' || toCheckAfterPopping == '[')
						return false;
					break;

				case ']':
					toCheckAfterPopping = myStack.pop();
					if (toCheckAfterPopping == '(' || toCheckAfterPopping == '{')
						return false;
					break;
				}				
			}			
		}

		return (myStack.isEmpty()); // Returns TRUE if the stack is empty (That is, WELL FORMED)
	}

	public static void main(String[] args) {
		// String s = "{}([{}])[]";
		String s = "[[(A)]]";

		// Function call
		if (areBracketsBalanced(s))
			System.out.println("The String is well formed :)");
		else
			System.out.println("The String is not well formed :(");
	}

}