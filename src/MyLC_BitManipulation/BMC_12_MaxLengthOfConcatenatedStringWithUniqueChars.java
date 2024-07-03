// LC - 1239
// Tricky

package MyLC_BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class BMC_12_MaxLengthOfConcatenatedStringWithUniqueChars {
	
	public static int maxLength(List<String> A) {
		
		List<Integer> dp = new ArrayList<Integer>();			// List that stores BitMask COMBINATIONS		
		dp.add(0);
		
		int result = 0;											// Answer
		
		for (String s : A) {									// Loop the List
			int duplicate = 0;									// Variable to check if the letter is duplicate
			int bitMask = 0;									// Variable to calculate BitMask
			for (char c : s.toCharArray()) {					// Loop each word in the list
				duplicate = duplicate | (bitMask & (1 << (c - 'a'))); // Std equation to check duplicate. Note |
				bitMask = bitMask | (1 << (c - 'a'));			// Std equation to calculate BitMask
			}
			
			if (duplicate > 0) continue;						// Duplicate > 0 ==> There is duplicate letter
																// Therefore, jump to NEXT WORD
																// This > 0 condition can be kept inside the
																// above loop itself by using 'break' instead of
																// 'continue'. But the same again we need to 
																// mention in the following loop.
			
			for (int i = 0 ; i < dp.size() ; i++) {				// For loop the List to & with all the available
																// BitMasks within it with the current BitMask.
																// Remember we have 0 in the dp List. & of it
				if ((dp.get(i) & bitMask) > 0) continue;		// with the current BitMak => First string in
																// concat operation.
				dp.add(dp.get(i) | bitMask);					// Add the concatenated string BitMask to dp.
				result = Math.max(result, Integer.bitCount(dp.get(dp.size() - 1)));	// Calculate result
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		
		List<String> arr = List.of("un","iq","ue");
		System.out.println(maxLength(arr));
		
		arr = List.of("cha","r","act","ers");
		System.out.println(maxLength(arr));
		
		arr = List.of("abcdefghijklmnopqrstuvwxyz");
		System.out.println(maxLength(arr));

	}

}