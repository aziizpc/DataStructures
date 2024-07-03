// LC - 1493

package MyLC_SlidingWindow;

public class SW_03_LongestSubarrayOf1sAfterDeletingOneElement {
	
	public static int longestSubarray(int[] nums) {		// Same logic as previous. Here we set 'k'

        int start = 0, end;
        int k = 1;

        for (end = 0 ; end < nums.length ; end++){
            if (nums[end] == 0) k--;
            if (k < 0){
                if (nums[start] == 0){
                    k++;
                }
                start++;
            }
        }

        return end - start - 1;
        
    }

	public static void main(String[] args) {
		
		int[] nums = {1, 1, 0, 1};
		
		System.out.println(longestSubarray(nums));
		
	}

}