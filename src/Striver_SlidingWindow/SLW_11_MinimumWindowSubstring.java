// LC - 76

package Striver_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SLW_11_MinimumWindowSubstring {

	public static String minWindow(String s, String t) {
		if (s.length() < t.length())
			return ""; 									// Invalid scenario => Return ""

		Map<Character, Integer> hm = new HashMap<>(); 	// Create a hm
		for (char c : t.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1); 		// Put all the elements in t into hm with freq
		}

		int n = s.length(); 							// s length as n
		int l = 0, r; 									// Left and Right pointers
		int count = t.length(); 						// 'count' value to 0. We will see if it becomes 0
		int minLength = Integer.MAX_VALUE; 				// Assume Integer.MAX_VALUE is the minLength.
														// We cannot set minLength as n as it indicates that 
														// the full string (s) is a valid substring
		int startIndex = 0; 							// For finding out the valid substring (left point)

		for (r = 0; r < n; r++) { 						// Right forward
			char rChar = s.charAt(r); 					// rChar
			if (hm.containsKey(rChar)) { 				// If rChar is available in the hm
				if (hm.get(rChar) > 0)					// and if the value of rChar in hm is > 0, 
					count--; 							// dec the count. i.e., whenever a valid key comes,
														// we dec the count. Our aim: Make count = 0 finally.
				hm.put(rChar, hm.getOrDefault(rChar, 0) - 1); // Dec its value in hm as well
			}

			while (count == 0) { 				// count = 0 => We have a valid substring.
												// Now, we need to do 2 things: 1. Check if the current substring
												// length is < existing substring length 2. trim unnecessary 
												// characters from the left side to make it as short as possible
				if ((r - l + 1) < minLength) { 	// If the current length (r-l+1) < minLength 
												// (minLength means existing length)
					minLength = (r - l + 1); 	// Set that as minLength
					startIndex = l; 			// Save the left index as we need it to make substring
				}

				char lChar = s.charAt(l); 		// For trimming: Save the left char
				if (hm.containsKey(lChar)) { 	// If lChar is available in the hm
					hm.put(lChar, hm.getOrDefault(lChar, 0) + 1);	// Increment the value in hm
																	// (Remember it's inc when removing)
					if (hm.get(lChar) > 0)
						count++; 				// Inc the count (That is, moving further from 0).
												// This will break from while when count becomes > 0. i.e., 1.
				}
				l++; 							// Move 'l' further
			}
		}

		return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLength); 
		// minLength = Integer.MAX_VALUE => Untouched
	}

	public static void main(String[] args) {

		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(minWindow(s, t));

	}

}