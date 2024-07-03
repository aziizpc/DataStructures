// LC - 342
// Self

package MyLC_BitManipulation;

public class BMC_02_PowerOfFour {
	
	public static boolean isPowerOfFour(int n) {	// SImilar to Power Of Two

        if (n <= 0) return false;

        int count = 1;								// This is a counter SET TO 1 (1 because of last leftover 1)

        while (n != 1){
            if ((n & 1) == 0){
                count++;
                n >>= 1;
            }
            else return false;
        }

        if ((count & 1) == 1) return true;			// If count is ODD ==> POWER OF FOUR (Eg: 10000 : 5 digits) 

        return false;
        
    }

	public static void main(String[] args) {
		
		int n1 = 16;		
		System.out.println(isPowerOfFour(n1));
		
		int n2 = 20;		
		System.out.println(isPowerOfFour(n2));

	}

}