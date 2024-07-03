package Striver_BitManipulation;

public class BIT_01_NumberOf1Bits {
	
    public static int hammingWeight(int n) {

        int ans = 0;

        while (n != 0){
            if ((n & 1) == 1) ans++;
            n >>= 1;
        }

        return ans;
        
    }

	public static void main(String[] args) {
		
		int n = 11;
		
		System.out.println(hammingWeight(n));

	}
	
	

}