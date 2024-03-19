// NOTE: Subsequence (NOT Sub-array)
// LC - 1332
// Question asks for minimum number of steps

package MyLC_String;

public class STR_16_RemovePalindromicSubsequences {
	
	public static int removePalindromeSub(String s) {

        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return 2;
            }
        }

        return 1;
        
    }

	public static void main(String[] args) {
		String s = "ababa";
		
		System.out.println(removePalindromeSub(s));

	}

}