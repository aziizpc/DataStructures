package SDETSheet;

public class SDET_031_MonotonicArray {

	public static boolean isMonotonic(int[] nums) {

		boolean inc = true;
		boolean dec = true;

		for (int i = 1; i < nums.length; i++) {
			inc = inc & (nums[i - 1] <= nums[i]);	// Bitwise AND
			dec = dec & (nums[i - 1] >= nums[i]);	// Bitwise AND
		}

		return inc || dec;							// Will return true if at least 
													// one is true

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3 };
		System.out.println(isMonotonic(arr));

		arr = new int[] { 6, 5, 4, 4 };
		System.out.println(isMonotonic(arr));

		arr = new int[] { 1, 3, 2 };
		System.out.println(isMonotonic(arr));

	}

}