// LC - 5
// Easy explanation: https://www.youtube.com/watch?v=uX0-xyPkR2w

package Striver_String;

public class STR_03_LongestPalindromicSubstring {
	
	public static String longestPalindrome(String s) {

        int n = s.length();

        if (n == 1) return s;							// Length = 1 => s itself is palindrome

        String ans = "";								// Answer variable

        for (int i = 1 ; i < n ; i++){					// Loop STARTING FROM 1!! Why? -> We take low = i - 1
        												// when checking EVEN

            // Checking Substrings with odd length:
            int low = i;								// Both low and high are same and move from there.
            int high = i;								// So, we get 1, 3, 5, 7 (Odd lengths)

            while (s.charAt(low) == s.charAt(high)){	// Check equality in while
                low--;									// Move backward
                high++;									// Move forward

                if (low == -1 || high == n) break;		// <0 or >(n - 1) => break
            }

            String palindrome = s.substring((low + 1), high);			// low + 1 and high because the length
            															// is decremented in the above if 
            															// before breaking
            
            if (ans.length() < palindrome.length()) ans = palindrome;	// Compare and update

            
            
            // Checking Substrings with even length:
            low = i - 1;												// low = i - 1
            high = i;													// So, we get 2, 4, 6, 8 (Even)

            while (s.charAt(low) == s.charAt(high)){					// Ditto
                low--;
                high++;

                if (low == -1 || high == n) break;
            }

            palindrome = s.substring((low + 1), high);					// low + 1 and high because the length
																		// is incremented in the above if 
																		// before breaking
            if (ans.length() < palindrome.length()) ans = palindrome;

        }

        return ans;
        
    }

	public static void main(String[] args) {
		
		String s = "babad";
		System.out.println(longestPalindrome(s));

	}

}
