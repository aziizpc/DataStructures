// LC-241

package MyLC_String;

import java.util.ArrayList;
import java.util.List;

public class STR_8_DifferentWaysToAddParentheses {

	public static List<Integer> diffWaysToCompute(String expression) {

		List<Integer> ans = new ArrayList<Integer>();

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (c == '+' || c == '-' || c == '*') {
				String firstPart = expression.substring(0, i);
				String secondPart = expression.substring((i + 1), expression.length());

				List<Integer> solveFir = diffWaysToCompute(firstPart); // Call recursively for first part
				List<Integer> solveSec = diffWaysToCompute(secondPart); // Call recursively for sec part
				
				System.out.println("fir: " + solveFir);
				System.out.println("sec: " + solveSec);

				int temp = 0; // For calculation

				for (Integer f : solveFir) { // Loop over first as there can be many values in the List based on the
												// operator count in the expression.
					for (Integer s : solveSec) { // ""
						switch (c) {
						case '+':
							temp = f + s;
							break;
						case '-':
							temp = f - s;
							break;
						case '*':
							temp = f * s;
							break;
						}

						ans.add(temp); // NOTE: Within both the loops
					}

				}

			}

		}

		if (ans.size() == 0)
			ans.add(Integer.valueOf(expression));

		return ans;

	}

	public static void main(String[] args) {
		String s1 = "2-1-1"; // Ans: [2,0]

		String s2 = "2*3-4*5"; // Ans: [-34,-10,-14,-10,10]

		System.out.println(diffWaysToCompute(s1));

		System.out.println(diffWaysToCompute(s2));

	}

}