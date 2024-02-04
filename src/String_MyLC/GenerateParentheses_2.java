package String_MyLC;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_2 {

	public static List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<String>();
		int openCount = 0;
		int closeCount = 0;
		getStrings(new String(), openCount, closeCount, n, ans);
		return ans;
	}

	public static void getStrings(String str, int openCount, int closeCount, int n, List<String> ans) {
		if (str.length() == 2 * n) {
			ans.add(str);
			return;
		}
		if (openCount < n) {
			getStrings(str + '(', openCount + 1, closeCount, n, ans);
		}
		if (closeCount < openCount) {
			getStrings(str + ')', openCount, closeCount + 1, n, ans);
		}
	}

	public static void main(String[] args) {

		int n = 5;
		
		System.out.println(generateParenthesis(n));

	}

}