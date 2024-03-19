// LC - 35

package MyLC_Arrays;

public class AML_11_SearchInsertPosition {
	
	static int searchInsert(int[] nums, int target) {	// New Binary Search
		
		int start = 0;
		int end = nums.length - 1;
		int mid = 0;
		
		while (start <= end) {
			
			mid = start + (end - start) / 2;
			
			if (nums[mid] == target) return mid;
			
			else if (nums[mid] > target) end = mid - 1; // THINK: As nums[mid] is already greater, we need to check in LHS
			
			else start = mid + 1; // THINK: As nums[mid] is already smaller, we need to check in RHS
			
		}
		
		return start;	// For normal Binary Search, return -1 here
		
	}
	

	public static void main(String[] args) {
		
		int[] nums = {1, 3, 5, 6};
		
		int target = 5;
		
		System.out.println("Position of " + target + ": " + searchInsert(nums, target));
		
		target = 2;
		
		System.out.println("Position of " + target + ": " + searchInsert(nums, target));
		
		target = 7;
		
		System.out.println("Position of " + target + ": " + searchInsert(nums, target));
		
		

	}

}