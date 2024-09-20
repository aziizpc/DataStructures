// LC - 476
// Self 100%

package MyLC_BitManipulation;

public class BMC_13_NumberComplement {
	
	public static int findComplement(int num) {

        int pos = 0;							// For denoting the position
        int ans = 0;							// Final answer

        while (num != 1){						// while num != 1
            if (num % 2 == 0){					// If EVEN (That is last bit is zero)
                ans += Math.pow(2, pos);		// Increment ans by Math.pow(2, pos)
            }
            pos++;								// Increment pos
            num >>= 1;							// Right shift num
        }
               
        return ans;								// Return ans
    }

	public static void main(String[] args) {
		
		int num = 5; 								// 5 --> 101
		
		System.out.println(findComplement(num));	// 2 --> 010

	}

}
