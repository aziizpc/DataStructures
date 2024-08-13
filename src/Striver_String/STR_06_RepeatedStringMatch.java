// LC - 686
// Rabin Karp Pattern matching algorithm
// 06 and 07 are same logic

package Striver_String;

public class STR_06_RepeatedStringMatch {

	public static int repeatedStringMatch(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();

        int minRepeats = (bLen + aLen - 1) / aLen;			// Minimum these many times 'a' should be repeated
        													// Memorize

        StringBuilder sb = new StringBuilder(a.repeat(minRepeats));	// Repeat a using StringBuilder

        if (strStr(sb.toString(), b)) {						// Pass the new sb along with b to the logic method
            return minRepeats;
        }

        sb.append(a);										// If the above if block is not TRUE, append one more

        if (strStr(sb.toString(), b)) {						// Repeat
            return minRepeats + 1;
        }

        return -1;											// If the second is also not true, return -1
    }

    public static boolean strStr(String haystack, String needle) {	// Rolling hash logic (Copied from STR_07)	

        char[] haystackArr = haystack.toCharArray();		// haystack array
        char[] needleArr = needle.toCharArray();			// needle array
        int m = haystackArr.length;							// haystack length
        int n = needleArr.length;							// needle length

        if (n > m) return false;							// needle length is greater => No need to continue

        int needleHash = 0;									// Now let's calculate needleHash		
        for (char c : needleArr){									
            needleHash += c * (int) (Math.pow(10, 2));	// Simple function written by me (May not work always)
            											// Learn writing function with MOD and all
            											// Here, we are multiplying each character value with 100
        }

        int l = 0, r = 0;								// Sliding window logic	
        												// Our aim is to get all windows in haystack of size 
        												// of needle and check if the hash value match

        int haystackHash = 0;							// Variable to store haystack hash
        while (r < m){									// while loop goes till END								
            char c = haystackArr[r];					
            haystackHash += c * (int) (Math.pow(10, 2));// Same equation as above			

            if (r - l == n){	// If window size is > that of needle
            					// Note: (r - l == n) => Greater since index start from 0
                haystackHash -= haystackArr[l] * (int) (Math.pow(10, 2));	
                l++;			// Drop the first char (That is char @ l) and move 'l' forward :) 				
            }														

            if (haystackHash == needleHash){			// If the hash values are same ..						
                int k = 0;								// .. we need to check char by char
                boolean flag = true;								
                for (int j = l ; j < r ; j++){			// for loop from l to r.			
                    if (haystackArr[j] != needleArr[k]){// Check if NOT similar			
                        flag = false;					// Set flag as false
                    }
                    k++;								// 'k' used for for loop of needle
                }
                if (flag == true) return true;			// flag == true => Matching => Return true
            }
            r++;										// r marches forward
        }

        return false;									// return false
        												// otherwise

    }

	public static void main(String[] args) {	// How many times a has to be repeated to make b subset of a
		
		String a = "abcd";						// ab cdabcdab cd	:)
		String b = "cdabcdab";		
		System.out.println(repeatedStringMatch(a, b));

	}

}