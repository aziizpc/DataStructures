// LC - 1781
// Self after checking

package MyLC_String;

public class STR_20_SumOfBeautyOfAllSubstrings {
	
	public static int getMax(int[] charCount){					// To get Max value in the array
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < 26 ; i++){
            if (charCount[i] != 0){								// THIS IS NOT REQUIRED
                max = Math.max(max, charCount[i]);				// Loop and find the max using Math.max
            }
        }
        return max;
    }

    public static int getMin(int[] charCount){					// To get Min value in the array
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < 26 ; i++){
            if (charCount[i] != 0){								// THIS IS REQUIRED HERE FOR MIN (THINK)
                min = Math.min(min, charCount[i]);				// Loop and find the max using Math.min
            }
        }
        return min;
    }

    public static int beautySum(String s) {							// Master function

        int sum = 0;												// Set sum to 0

        for (int i = 0 ; i < s.length() ; i++){						// For loop the entire String
            int[] charCount = new int[26];							// Create a 26 length INT array
            for (int j = i ; j < s.length() ; j++){					// For loop again from 'i' (For substrings)
                charCount[s.charAt(j) - 'a']++;						// Increase the array based on occurrence
                int beauty = getMax(charCount) - getMin(charCount);	// Calculate the DIFFERENCES @ each substring
                sum += beauty;										// Increment the sum
            }
        }
        return sum;        											// Output
    }

	public static void main(String[] args) {
		
		String s = "aabcb";
		
		System.out.println(beautySum(s));

	}

}