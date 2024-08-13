// LC - 1358
// Self with Striver input

package Striver_SlidingWindow;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SLW_06_NumberOfSubstringsContainingAllThreeCharacters {
	
	public static int numberOfSubstrings(String s) {
		
		/* Here, we solve in this manner: Consider the example -> s = "abcabc".
		 * We navigate from L to R and store the index of each character. In this example, Once we reach 
		 * @ index 2, we have HM values as (0,1,2). As we have values > -1 for all three, we now, add 1 to ans 
		 * as we got one valid substring. Also, we find the current smallest index and thereby adding that value
		 * to ans as we know that the substrings formed by its LEFT SIDE CHARACTERS, are also valid ones.
		 * That is, for example -> s = "bbacba". If "bac" is valid "bbac" is also valid. That is, prepending
		 * all the available characters in the substring before the character in the substring that has lowest
		 * index. Likewise :)     
		 * 
		 */

		int n = s.length();
        int r;
        int ans = 0;

        Map<Character, Integer> hm = new HashMap<Character, Integer>();				// Create a HM
        hm.put('a', -1);															// Insert -1 to all for now
        hm.put('b', -1);
        hm.put('c', -1);

        for (r = 0 ; r < n ; r++){													// R forward
            char rChar = s.charAt(r);												// Get the character
            hm.put(rChar, r);														// Insert as no precondition

            if ((hm.get('a') != -1) && (hm.get('b') != -1) && (hm.get('c') != -1)){	// If indices are UPDATED
                ans += 1;															// +1 for current substring
                int lowestIndex = Collections.min(hm.values());						// Get the lowest index
                ans += lowestIndex;													// Add to ans
                																	// Index starts from 0. That
                																	// is why lowestIndex
                																	// added directly.
            }

        }

        return ans;
        
    }

	public static void main(String[] args) {
		
		String s = "abcabc";
		System.out.println(numberOfSubstrings(s));

	}

}