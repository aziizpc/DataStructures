package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class String_LongestSubstringWithoutRepeating {

	public static void main(String[] args) {

		String s = "abcaabcdba";
		System.out.println("Length: " + lengthOfLongestSubstring(s));

	}

	public static int lengthOfLongestSubstring(String s) {

		int left = 0, right = 0;
		int n = s.length();
		int len = 0;

		Map<Character, Integer> myMap = new HashMap<Character, Integer>();

		while (right < n) {
			if (myMap.containsKey(s.charAt(right))) {
				left = Math.max(left, myMap.get(s.charAt(right)) + 1);
			}
			myMap.put(s.charAt(right), right);
			len = Math.max(len, right - left + 1);
			right++;
		}

		return len;
	}

}
