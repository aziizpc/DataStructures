// LC - 784
// 100% self

package SDETSheet;

import java.util.ArrayList;
import java.util.List;

public class SDET_014_LetterCasePermutation {
	
	public static List<String> letterCasePermutation(String s) {

        int numOfCharacters = 0;							// To store the number of LETTERS in Sting

        for (char c : s.toCharArray()){
            if (Character.isLetter(c)){
                numOfCharacters++;							// Get the count
            }
        }

        int numOfPossibleStrings = 1 << numOfCharacters;	// Equivalent to Math.pow(2, numOfCharacters)

        List<String> ans = new ArrayList<String>();			// ans

        for (int num = 0 ; num < numOfPossibleStrings ; num++){	// Loop 'numOfPossibleStrings' times
            StringBuilder sb = new StringBuilder();			
            int val = num;									// Store the num to val (Important)
            for (char c : s.toCharArray()){					// Loop the characters in the string
                if (Character.isLetter(c)){					// If it's letter ...
                    if ((val & 1) == 1){					// & operation gives 1:
                        sb.append(Character.toUpperCase(c));// => We make the letter capital and append
                    }
                    else {
                        sb.append(Character.toLowerCase(c));// else we make it lower and append
                    }
                    val >>= 1;								// Right Shift operation
                }
                else {
                    sb.append(c);							// If NOT LETTER, just append
                }
            }
            ans.add(sb.toString());							// Add to ans ArrayList
        }

        return ans;
        
    }

	public static void main(String[] args) {
		
		String s = "a1b2";
		
		System.out.println(letterCasePermutation(s));

	}

}
