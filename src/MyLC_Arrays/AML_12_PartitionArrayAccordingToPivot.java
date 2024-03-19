// LC - 2161

package MyLC_Arrays;

import java.util.Arrays;

public class AML_12_PartitionArrayAccordingToPivot {
	
	static int[] doPartitioning(int[] nums, int pivot){
		
		int[] ans = new int[nums.length];
		
		int left = 0;
		int right = nums.length - 1;
		
		for (int i = 0 ; i < nums.length ; i++) {	// Insert smaller @ left by looping from start
			if (nums[i] < pivot) {
				ans[left++] = nums[i];
			}
			if (nums[nums.length - 1 - i] > pivot) {	// Insert larger @ right by looping from end
				ans[right--] = nums[nums.length - 1 - i];
			}
		}
		
		while (left <= right) {		// Insert pivot at remaining portions
			ans[left++] = pivot;	// Actually, this is enough
			ans[right--] = pivot;
		}
		
		return ans;
		
	}

	public static void main(String[] args) {

		int[] nums = {9,12,5,10,14,3,10};
		int pivot = 10;
		
		System.out.println(Arrays.toString(doPartitioning(nums, pivot)));

	}

}