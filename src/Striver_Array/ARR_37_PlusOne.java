// LC - 66
// Tricky

package Striver_Array;

import java.util.Arrays;

public class ARR_37_PlusOne {
	
	public static int[] getPlusOneArray(int[] digits) {
		
		for (int i = digits.length - 1 ; i >= 0 ; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		
		digits = new int[digits.length + 1];
		
		digits[0] = 1;
		
		return digits;
		
	}
	

	public static void main(String[] args) {
		
		int[] digits = {9,9,9,9,9,9,9,8};		
		System.out.println(Arrays.toString(getPlusOneArray(digits)));
		
		digits = new int[] {9,9,9,9,9,9,9,9};		
		System.out.println(Arrays.toString(getPlusOneArray(digits)));

	}

}