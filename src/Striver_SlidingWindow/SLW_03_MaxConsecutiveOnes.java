// LC - 1004
// Lee - Tricky

package Striver_SlidingWindow;

public class SLW_03_MaxConsecutiveOnes {
	
	public static int longestOnes(int[] nums, int k) {
        int l = 0, r;								// Set the l and r
        
        for (r = 0; r < nums.length; ++r) {			// We will use 'r' with the for loop
        	
            if (nums[r] == 0) k--;					// Every time 0 comes @ R => Decrement k
            
            if (k < 0) {							// While decrementing, if k becomes negative				
                if (nums[l] == 0) {					// .. And if the element @ L is 0
                    k++;							// Increment k
                }
                l++;								// Whatever it may, increment 'L'
            }
        }

        return r - l;								// end - start will give the result
        											// Not needed to check the max of end - start @ each 
        											// iteration as the max of end - start will be retained
        											// throughout
        
        /*
         * The second if block can be written as following as well:
         * if (k < 0 && nums[start++] = 0) {	// The start will always be incd. when 1st cond. k < 0 is met					
                k++;							// If both conditions are met, k is incremented.
            }
         * 
         * ---------------------------
         * Incrementing k (In second if block) makes sure that the size overall doesn't change and thus the
         * subarray with more than 'k' ones would not account for the size.
         */
    }

	public static void main(String[] args) {
		
		int[] nums = {1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0};
		int k = 2;
		
		System.out.println(longestOnes(nums, k));

	}

}
