// LC - 318
// Self

package MyLC_BitManipulation;

public class BMC_07_MaximumProductOfWordLengths {
	
	public static int maxProduct(String[] words) {			// Will store bitmasks for each word and compare

        int n = words.length;
        int[] bitMasks = new int[n];						// Create an array of length n to store bit masks

        for (int i = 0 ; i < words.length ; i++){			// For loop entire array
            for (char c : words[i].toCharArray()){			// Word by word with iterator i
                bitMasks[i] = bitMasks[i] | (1 << (c - 'a'));// Standard equation 
            }
        }

        int maxProduct = 0;									// ans

        for (int i = 0 ; i < bitMasks.length - 1 ; i++){	// for loop i: 0 to (n - 2)
            for (int j = i + 1 ; j < bitMasks.length ; j++){// for loop j: (i + 1) to (n - 1)
                if ((bitMasks[i] & bitMasks[j]) == 0){		// ZERO => NO CHARACTERS ARE SAME
                    maxProduct = Math.max(maxProduct, (words[i].length() * words[j].length()));	// Compare
                }
            }
        }

        return maxProduct;
        
        /* Just an example how bit masks are stored:
         * WORD1: 00000000001110100010001010
         * WORD2: 11000000000001000001110101
         * & operation of these words give 0 :) This is what we want
         */
        
    }

	public static void main(String[] args) {
		
		String[] str = {"abcw","baz","foo","bar","xtfn","abcdef"};
		
		System.out.println(maxProduct(str));

	}

}