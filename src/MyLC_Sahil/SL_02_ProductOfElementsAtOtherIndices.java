package MyLC_Sahil;

import java.util.Arrays;

public class SL_02_ProductOfElementsAtOtherIndices {
	
	public static int[] productExceptSelf(int[] nums) {
	    int n = nums.length;
	    int[] result = new int[n];

	    // First pass: calculate products of all elements to the left
	    result[0] = 1; 					// There's nothing to the left of the first element
	    for (int i = 1; i < n; i++) {
	        result[i] = result[i - 1] * nums[i - 1];
	    }
	    
	    System.out.println(Arrays.toString(result));

	    // Second pass: calculate products of all elements to the right
	    int rightProduct = 1; 			// Initially, there's nothing to the right of the last element
	    for (int i = n - 1; i >= 0; i--) {
	        result[i] = result[i] * rightProduct;
	        rightProduct *= nums[i]; 	// Update the rightProduct for the next element
	    }

	    return result;
	}


	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));

	}

}