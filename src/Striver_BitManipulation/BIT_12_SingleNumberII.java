// LC - 137
// Easy solution - Can be modified and used for all the similar cases

package Striver_BitManipulation;

public class BIT_12_SingleNumberII {

	public static int singleNumberThree(int[] nums) { 	// One number exactly once and the others all thrice

		int ans = 0;									// Answer variable
		
		for (int i = 0; i < 32; i++) {					// For loop i: 0 to 31
			
			int sum = 0;								// Create a variable sum and set it to 0
			
			for (int j = 0; j < nums.length; j++) {		// For loop the whole array
				
				if (((nums[j] >> i) & 1) == 1) {		// Shift right the current value by i and check last bit
					sum++;								// If the bit = 1, Increment 'sum'
				}
				
				sum %= 3;								// After looping the whole array, do sum %= 3 
			}											// Note (Imp): Here, we either get 0 or 1 if we do this
														// Why? All but one numbers occur 3 times
			
			if (sum != 0) {								// If sum != 0 (Can also write: if sum == 1)
				ans |= sum << i;						// Set the ith bit of 'ans' to 1 (By doing Shift Left)
			}
		}
		
		return ans;
	}

	public static int singleNumberTwo(int[] nums) { 	// One number exactly once and the others all twice

		int ans = 0;
		
		for (int i = 0; i < 32; i++) {
			int sum = 0;
			for (int j = 0; j < nums.length; j++) {
				if (((nums[j] >> i) & 1) == 1) {
					sum++;
				}
				sum %= 2; 								// NOTE (This is the only change)
			}
			if (sum != 0) {
				ans |= sum << i;
			}
		}
		return ans;

	}

	public static void main(String[] args) {

		int[] nums1 = { 2, 2, 3, 2 };
		System.out.println(singleNumberThree(nums1));

		int[] nums2 = { 2, 2, 1, 3, 3, 4, 4 };
		System.out.println(singleNumberTwo(nums2));

	}

}