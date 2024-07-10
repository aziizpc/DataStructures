// LC - 424
// Self coded with Striver input

package Striver_SlidingWindow;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SLW_07_LongestRepeatingCharacterReplacement {
	
	public static int characterReplacement(String s, int k) {

        int n = s.length();
        int l = 0, r;
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        int curLen = 0;
        int maxLen = 0;

        for (r = 0 ; r < n ; r++){										// Right index moves forward
            char c = s.charAt(r);										
            hm.put(c, hm.getOrDefault(c, 0) + 1);						// We directly insert into Map as we 
            															// don't have a size restriction in this 
            curLen++;													// Increase the current length counter

            int maxFreq = Collections.max(hm.values());					// Get the MAXIMUM FREQ from the HM

            while (curLen - maxFreq > k){								// This is the deciding factor
            															// That is, sum of the remaining values
            															// in HM should NOT exceed k (As per qn)
                hm.put(s.charAt(l), hm.getOrDefault(s.charAt(l), 0) - 1);// Decrement the value in HM 
                curLen--;												// Decrement the current length counter
                if (hm.get(s.charAt(l)) == 0) hm.remove(s.charAt(l));	// Val = 0 ==> Remove from HM
                l++;													// Move the left pointer forward 
            }

            maxLen = Math.max(maxLen, curLen);							// This is what we want

        }
        
        /*
         * When check "curLen - maxFreq > k" and move the 'l' forward. We may or may not discard all the
         * duplicate elements. Our ONLY goal is the initial equation.
         * 
         * NOTE!! -> The problem will work even if the 'while' is changed to 'if'. You know the reason :)  
         *   
         */

        return maxLen;
        
    }

	public static void main(String[] args) {
		
		String s = "AABABBA";
		int k = 1;
		System.out.println(characterReplacement(s, k));

	}

}
