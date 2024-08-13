// LC - 28 (Easy)
// 100% Self :)

package Striver_String;

public class STR_07_FindTheIndexOfTheFirstOccurrenceInAString {
	
	public static int strStr(String haystack, String needle) {		// Rolling hash & Sliding Window

        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        int m = haystackArr.length;
        int n = needleArr.length;

        if (n > m) return -1;										// n > m => needle size is greater => -1

        int needleHash = 0;											// Calculate the hash for 'needle'
        for (char c : needleArr){									// Simple function that I wrote
            needleHash += c * (int) (Math.pow(10, 2));				// We can write better functions
        }

        int l = 0, r = 0;											// Left and Right pointers for SW

        int haystackHash = 0;										// Variable to calculate 'haystack' hash 
        while (r < m){												// Navigate till the LAST OF 'haystack'
            char c = haystackArr[r];								// Get the current character
            haystackHash += c * (int) (Math.pow(10, 2));			// Same equation as above

            if (r - l == n){										// If size = n, we need to remove 'l'
                haystackHash -= haystackArr[l] * (int) (Math.pow(10, 2));	// .. side element
                l++;												// .. and move the 'l' indicator forward
            }														// Check with e.g. to get "r - l == n" 

            if (haystackHash == needleHash){						// If the hash codes are equal
                int k = 0;											// k used for indexing 'needle'
                boolean flag = true;								// boolean flag 
                for (int j = l ; j < r ; j++){						// for loop that portion: l ... r
                    if (haystackArr[j] != needleArr[k]){			// If the corresponding elements aren't EQUAL
                        flag = false;								// Set flag to false
                    }
                    k++;
                }
                if (flag == true) return l;							// return 'l' if flag = true
            }
            r++;													// 'r' forward
        }

        return -1;													// Return -1
        
    }

	public static void main(String[] args) {
		
		String haystack = "sadbutsad";
		String needle = "sad";		
		System.out.println(strStr(haystack, needle));
		
		haystack = "aderusadbutsad";
		needle = "sad";		
		System.out.println(strStr(haystack, needle));

	}

}