package Freshworks;

import java.util.HashMap;
import java.util.Map;

public class FRW_04_LongestSubstringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {

		int l = 0;
		int r = 0;
		int n = s.length();
		int maxLen = 0;

		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		while (r < n) {
			char c = s.charAt(r);

			if (hm.containsKey(c) && hm.get(c) >= l) {	// Char already in the HM AND Char value >= l
				l = hm.get(c) + 1;
			}

			maxLen = Math.max(maxLen, r - l + 1);
			hm.put(c, r);
			r++;
		}

		return maxLen;

	}

	public static void main(String[] args) {

		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));

	}

}
