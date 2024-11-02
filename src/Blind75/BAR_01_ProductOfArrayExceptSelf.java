package Blind75;

import java.util.Arrays;

public class BAR_01_ProductOfArrayExceptSelf {
	
	public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];								// Answer array
        Arrays.fill(ans, 1);								// Fill the answer array with 1

        int current = 1;									// Set current to 1

        for (int i = 0 ; i < n ; i++){						// Prefix sum: START TO END
            ans[i] *= current;
            current *= nums[i];
        }

        current = 1;
        for (int i = (n - 1) ; i >= 0 ; i--){				// Suffix sum: END TO START
            ans[i] *= current;
            current *= nums[i];
        }

        return ans;											// Return the answer
        
    }

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(arr)));
		
		arr = new int[] {-1,1,0,-3,3};
		System.out.println(Arrays.toString(productExceptSelf(arr)));

	}

}