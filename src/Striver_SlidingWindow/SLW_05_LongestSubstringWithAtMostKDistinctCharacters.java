// LC locked

package Striver_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SLW_05_LongestSubstringWithAtMostKDistinctCharacters {
	
	public static String getSubstring(String s, int k) {
		
		/*
		 * PRECONDITION: MAX DISTINCT CHARACTERS (KEY) POSSIBLE = k
		 */
		
		int n = s.length();
		int l = 0, r;
		Map<Character, Integer> hm = new HashMap<Character, Integer>(); 
		StringBuilder temp = new StringBuilder();
		StringBuilder ans = new StringBuilder();
		
		for (r = 0 ; r < n ; r++) {
			char c = s.charAt(r);
			
			while (hm.size() == k && (!hm.containsKey(c)) && (l < r)) {
				hm.put(s.charAt(l), hm.getOrDefault(s.charAt(l), 0) - 1);
				temp.deleteCharAt(0);
				if (hm.get(s.charAt(l)) == 0) hm.remove(s.charAt(l));
				l++;
			}
			
			hm.put(c, hm.getOrDefault(c, 0) + 1);
			temp.append(c);
			if (temp.length() > ans.length()) ans = new StringBuilder(temp);
		}
		
		return ans.toString();
		
	}

	public static void main(String[] args) {
		
		String s = "aaabbccd";
		int k = 2;		
		System.out.println(getSubstring(s, k));
		
		s = "aabbcccffffcccccdeefffccccffffggggg";
		k = 3;		
		System.out.println(getSubstring(s, k));

	}

}