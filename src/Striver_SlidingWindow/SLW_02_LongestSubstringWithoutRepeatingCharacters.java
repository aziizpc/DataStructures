// LC - 3

package Striver_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SLW_02_LongestSubstringWithoutRepeatingCharacters {
	
	public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int l = 0, r = 0;
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        int maxLen = 0;

        while (r < n){
            char c = s.charAt(r);
            
            if ((hm.containsKey(c)) && (hm.get(c) >= l)){	// If the key has already appeared before & if it's
            												// within the current l (left) and r (right).
                l = hm.get(c) + 1;							// Update the l (left) to the index next to the one
            }												// in HM (existing) so that duplicate is discarded
            
            hm.put(c, r);									// Put OR Update the HM with latest char & index
            maxLen = Math.max(maxLen, r - l + 1);			// Equation for length. Find the max of it.
            r++;											// Move forward!
        }

        return maxLen;
        
    }

	public static void main(String[] args) {
		
		String s = "abcabcbb";		
		System.out.println(lengthOfLongestSubstring(s));
		
		s = "fffftttrrrssss";		
		System.out.println(lengthOfLongestSubstring(s));
		
		s = "wwwww";		
		System.out.println(lengthOfLongestSubstring(s));
		
		s = "abdeb";		
		System.out.println(lengthOfLongestSubstring(s));

	}

}
