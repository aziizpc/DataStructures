// LC - 409
// Full self

package MyLC_String;

public class STR_15_LongestPalindrome {

	public static int longestPalindrome(String s) {

		int[] alpha = new int[52];

		for (char c : s.toCharArray()) {
			if (((int) c) >= 97)
				alpha[c - 'a']++;
			else
				alpha[c - 'A' + 26]++;
		}

		int odd = 0;

		int ans = 0;

		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i] != 0 && alpha[i] % 2 == 0)
				ans += alpha[i];		// If even, we take as it is
			else if (alpha[i] != 0 && alpha[i] % 2 != 0) {
				ans += alpha[i] - 1;	// If odd, we are taking only the next lowest even number
				if (odd == 0)
					odd = 1;			// Only one odd allowed
			}
		}

		return ans + odd;				// We need only one odd if it's there (THINK!!)

	}

	public static void main(String[] args) {
		String s = "abccccdd";

		System.out.println(longestPalindrome(s));

	}

}