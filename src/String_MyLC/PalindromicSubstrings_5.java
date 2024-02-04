package String_MyLC;

public class PalindromicSubstrings_5 {

	public static int countSubstrings(String s) {
		int len = s.length(), ans = 0;
		for (int i = 0; i < len; i++) {

			// System.out.println("i: " + i);

			int left = i - 1, right = i;

			while (right < len - 1 && s.charAt(right) == s.charAt(right + 1)) // Check for the same characters
																				// adjacently
				right++;

			ans += (right - left) * (right - left + 1) / 2;

			i = right++; // Java always evaluates from L -> R. Therefore, the current value of right is assigned to i. Then, right is incremented by 1.
							// That is, i = right; right++;

			while (left >= 0 && right < len && s.charAt(right++) == s.charAt(left--)) // Check for the same chars at
																						// right and left
				ans++;
		}
		return ans;
	}

	public static void main(String[] args) {

		String s1 = "aaabbaaa";
		System.out.println(countSubstrings(s1));

		String s2 = "malayalam";
		System.out.println(countSubstrings(s2));

	}

}

/*
 * 
 * a a a a a a
 * 
 * ans += 6
 * 
 */