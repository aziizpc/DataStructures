// LC - 1248

package Striver_SlidingWindow;

public class SLW_09_CountNumberOfNiceSubarrays {
	
	public static int numberOfSubarrays(int[] nums, int k) {
		
		return getCountOfSubarraysWithSumLesserThanOrEqualToK(nums, k) - 
				getCountOfSubarraysWithSumLesserThanOrEqualToK(nums, k - 1);
		
		/*
		 * Solution same as the SLW_08. Here, we just consider ONLY odd numbers in the array while taking sum.
		 * The odd numbers must be be considered as 1 and even numbers are discarded(0). Then, we check the 
		 * count of sum lesser or equal to k.
		 */
		
	}
	
	public static int getCountOfSubarraysWithSumLesserThanOrEqualToK(int[] nums, int k) {
		
		int n = nums.length;
		int l = 0, r;
		int sum = 0;
		int count = 0;
		
		for (r = 0 ; r < n ; r++) {
			int val = nums[r];
			
			if ((val & 1) == 1) sum += 1;
			else if ((val & 1) == 0) sum += 0;
			
			while ((sum > k) && (l < r)) {
				sum -= ((nums[l] & 1) == 1 ? 1 : 0);
				l++;
			}
			
			if (sum <= k) count += (r - l + 1);
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {2,2,2,1,2,2,1,2,2,2};
		int k = 2;
		
		System.out.println(numberOfSubarrays(arr, k));

	}

}