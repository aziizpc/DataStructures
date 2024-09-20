// LC - 5

package Freshworks;

public class FRW_07_LongestPalindromicSubstring {

	public static String longestPalindrome(String s) {

        int n = s.length();

        if (n == 1) return s;

        String ans = "";

        for (int i = 1 ; i < n ; i++){

            // Checking Substrings with odd length:
            int low = i;
            int high = i;

            while (s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if (low == -1 || high == n) break;
            }

            String palindrome = s.substring((low + 1), high);
            if (ans.length() < palindrome.length()) ans = palindrome;

            // Checking Substrings with even length:
            low = i - 1;
            high = i;

            while (s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if (low == -1 || high == n) break;
            }

            palindrome = s.substring((low + 1), high);
            if (ans.length() < palindrome.length()) ans = palindrome;

        }

        return ans;
        
    }

	public static void main(String[] args) {

		String s = "babad";
		
		System.out.println(longestPalindrome(s));

	}

}
