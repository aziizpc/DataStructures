// LC-1021

package MyLC_String;

public class STR_7_RemoveOutermostParentheses {

	public static String removeOuterParentheses(String s) {

		StringBuilder sb = new StringBuilder();
		int open = 0;
		char[] arr = s.toCharArray();
		int n = arr.length;

		if (n == 2)
			return "";

		for (int i = 0; i < n; i++) {
			char c = arr[i];
			if (c == '(') {
				open++;				// Increment and then check
				if (open > 1)
					sb.append('(');
			} else {
				if (open > 1)		// Check and then decrement
					sb.append(')');
				open--;
			}
		}

		return sb.toString();

	}

	public static void main(String[] args) {
		String s = "(()())(())";
		
		System.out.println(removeOuterParentheses(s));

	}

}