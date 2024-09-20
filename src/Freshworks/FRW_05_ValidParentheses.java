package Freshworks;

import java.util.Stack;

public class FRW_05_ValidParentheses {

	public static boolean isValid(String s) {

		char[] arr = s.toCharArray();

		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];

			if (c == '(' || c == '[' || c == '{') {
				st.push(c);
				continue;
			}

			if (st.isEmpty())
				return false;

			else {
				char d = st.pop();
				switch (c) {
				case ')':
					if (d == '(') {
						continue;
					} else
						return false;
				case ']':
					if (d == '[') {
						continue;
					} else
						return false;
				case '}':
					if (d == '{') {
						continue;
					} else
						return false;
				}
			}
		}

		return st.isEmpty();

	}

	public static void main(String[] args) {

		String s = "()[]{}";

		System.out.println(isValid(s));

	}

}