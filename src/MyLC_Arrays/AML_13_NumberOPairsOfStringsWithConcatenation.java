// LC - 2023

package MyLC_Arrays;

import java.util.HashMap;
import java.util.Map;

public class AML_13_NumberOPairsOfStringsWithConcatenation {
	
	public static int getNumberOPairs(String nums[], String target) {
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		
		for (String num : nums) {
			mp.put(num, mp.getOrDefault(num, 0) + 1);
		}
		
		String a = "";
		String b = "";
		int n = target.length();
		
		int ans = 0;
		
		for (int i = 1 ; i < n ; i++) {	// Start from i = 1 as we are passing it to get substrings
			a = target.substring(0, i);	// Get substrings based on 'i'
			b = target.substring(i, n);
			
			if (mp.containsKey(a) && mp.containsKey(b)) {	// Check if the substrings are mp keys
				if (a.equals(b)) ans += mp.get(a) * (mp.get(a) - 1);	// Equal => Same should not be counted twice
				else ans += mp.get(a) * mp.get(b);	// Straightforward
			}
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		
		String[] nums = {"123","4","12","34"};
		String target = "1234";
		
		System.out.println(getNumberOPairs(nums, target));
		
		nums = new String[] {"777","7","77","77"};
		target = "7777";
		
		System.out.println(getNumberOPairs(nums, target));

	}

}
