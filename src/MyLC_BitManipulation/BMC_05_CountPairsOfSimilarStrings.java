// LC - 2506

package MyLC_BitManipulation;

import java.util.HashMap;
import java.util.Map;

public class BMC_05_CountPairsOfSimilarStrings {
	
	public static int getCount(String[] words) {
		
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();	// HM to insert bitValue and its occurrence
		
		for (String word : words) {									// Loop the string of words
			int bitValue = 0;										// Declare bitValue and init to 0
																	// Each word has a bitValue
			for (char ch : word.toCharArray()) {					// Get each character in the word
				bitValue = bitValue | (1 << (ch - 'a'));			// THE EQUATION (Memorize)
																	// Note: We are left shifting 1
			}
			hm.put(bitValue, hm.getOrDefault(bitValue, 0) + 1);		// Put in HM
		}
		
		int ans = 0;
		
		for (int n : hm.values()) {									// Get values in HM
			ans += (n * (n - 1) ) / 2;								// Combination standard equation
		}
		
		return ans;													// Return ans
		
	}

	public static void main(String[] args) {
		
		String[] words = {"aba","aabb","abcd","bac","aabc"};		
		System.out.println(getCount(words));
		
		words = new String[] {"aabb","ab","ba"};
		System.out.println(getCount(words));

	}

}