// LC - 1004
// Lee - Tricky

package MyLC_SlidingWindow;

public class SW_02_MaxConsecutiveOnes {
	
	public static int longestOnes(int[] nums, int k) {
        int start = 0, end;								// Set the start and end of SW
        
        for (end = 0; end < nums.length; ++end) {		// We will use 'end' with the for loop
        	
            if (nums[end] == 0) k--;					// EVerytime 0 comes @ end => Decrement k
            
            if (k < 0) {								// While decrementing, if k becomes negative				
                if (nums[start] == 0) {					// .. And if the element @ START is 0
                    k++;								// Increment k
                }
                start++;								// Whatever it may, increment 'start'
            }
        }

        return end - start;								// end - start will give the result
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
		
		int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
		int k = 2;
		
		System.out.println(longestOnes(nums, k));

	}

}
