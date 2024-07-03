// LC - 231
// Self

package MyLC_BitManipulation;

public class BMC_01_PowerOfTwo {
	
	public static boolean isPowerOfTwo(int n) {		// The function checks if the given number is power of 2

        if (n <= 0) return false;					// n <= 0, just return FALSE

        while (n != 1){								// We know that only MSB is set for n which are pow of 2
            if ((n & 1) == 0){						// So, we do AND operations with 1 and make sure it gives 0
                n >>= 1;							// And then do RS
            }
            else return false;						// Else ==> LSB is 1 ==> Number is not power of 2
        }

        return true;								// Now, n = 1 ==> The number is power of 2
        
    }

	public static void main(String[] args) {
		
		int n1 = 16;		
		System.out.println(isPowerOfTwo(n1));
		
		int n2 = 13;		
		System.out.println(isPowerOfTwo(n2));

	}

}