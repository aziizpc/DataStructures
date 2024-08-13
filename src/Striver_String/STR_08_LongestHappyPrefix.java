// LC - 1392
// Self :) But changed the equations with ChatGPT

package Striver_String;

public class STR_08_LongestHappyPrefix {
	
	/*	Input: s = "level"

		0 10 210 3210 43210

		43210 3210 210 10 0

		--------------------

		Forward:
		11 * 10^0				11
		11 * 10^1 + 5 * 10^0			110 + 5 = 115		First * 10 + 5
		11 * 10^2 + 5 * 10^1 + 21 * 10 ^ 0	1100 + 50 + 21 = 1171	Second * 10 + 21
		That is, forward = existing forward * BASE + New number			

		Backward:
		Just add
		That is, backward = existing backward + (New number * BASEPOWER)
	 	* 
	 	*/
	
	public static String longestPrefix(String s) {
        // Constants
        int MOD = 1000000007;
        int BASE = 31;

        // Convert string to character array
        char[] arr = s.toCharArray();
        int n = arr.length;

        // Initialize variables
        long forward = 0;
        long backward = 0;
        long basePower = 1; // BASE^k % MOD
        int end = 0;

        // Loop through the string from start to n-2
        for (int i = 0; i < n - 1; i++) {
            // Current characters from start and end
            char c = arr[i];
            char d = arr[n - 1 - i];

            // Update forward and backward hash values using modular arithmetic
            forward = ((forward * BASE) + (c - 'a')) % MOD;
            backward = (backward + (d - 'a') * basePower) % MOD;

            // Update basePower for the next position
            basePower = (basePower * BASE) % MOD;

            // If they match, update end if this is the longest match so far
            if (forward == backward) {
                if ((i + 1) > end) {
                    end = i + 1;
                }
            }
        }

        // Return the longest prefix which is also a suffix
        if (end != 0) return s.substring(0, end);

        // If no such prefix exists, return an empty string
        return "";
    }

	public static void main(String[] args) {
		
		String s = "level";
		System.out.println(longestPrefix(s));

	}

}
