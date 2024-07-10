// LC - 930
// Check ARR_26_SubarraySumEqualsKCount first. As this problem is binary, ARR_26 can be further optimized.
// That is SC of O(N) can be reduced to O(1)

package Striver_SlidingWindow;

public class SLW_08_BinarySubarraysWithSum {
	
	public static int numSubarraysWithSum(int[] nums, int goal) {

        return getCountOfSubarraysWithSumLesserThanOrEqualToGoal(nums, goal) - 	// The difference of <= goal and <= (goal-1)
        getCountOfSubarraysWithSumLesserThanOrEqualToGoal(nums, goal - 1);		// solves this problem
        
    }

    public static int getCountOfSubarraysWithSumLesserThanOrEqualToGoal(int[] nums, int goal){

        int n = nums.length;
        int l = 0, r;
        int sum = 0;
        int count = 0;

        for (r = 0 ; r < n ; r++){						// r forward
            int val = nums[r];							
            sum += val;									// Calculate the sum

            while (sum > goal && (l < r)){				// WHILE the is sum > goal
                sum -= nums[l];							// Keep decrementing until the sum becomes <= 
                l++;									// l forward
            }

            if (sum <= goal) count += (r - l + 1);		// If sum <= goal --> Get the distance b/w r & l
            											// as we can form that many subarrays in that gap
            											// The 'if' condition is mandatory.

        }

        return count;

    }

	public static void main(String[] args) {
		
		int[] nums = {1,0,1,0,1};
		int goals = 2;
		
		System.out.println(numSubarraysWithSum(nums, goals));

	}

}