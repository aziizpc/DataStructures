// C = O(logn)	| 

package Array;

public class BinarySearch {

	public int searchArray(int myArray[], int num, int start, int end) {

		if (myArray.length == 0 || start > end) { // Note: start > end ==> Element doesn't exist in array
			// System.out.println("Test");
			return -1;
		}

		int mid = (start + end) / 2; 		// NOTE: One method to find mid (Can cause integer overflow)

		//int mid = start + (end - start) / 2; 	// NOTE: Second method to find mid (More accurate because it reduces the
												// risk of integer overflow)

		if (num == myArray[mid]) {
			return mid;
		}

		if (num < myArray[mid]) {
			return searchArray(myArray, num, 0, mid - 1);
		} else {
			return searchArray(myArray, num, mid + 1, (myArray.length - 1));
		}
	}

	static int searchArray(int[] nums, int target) {

		int start = 0, mid;
		int end = nums.length - 1;

		while (start <= end) {
			mid = start + (end - start) / 2;	// Other method to find mid
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target)
				end = mid - 1;
			else
				start = mid + 1;
		}

		return -1;

	}

	static public void main(String[] args) {

		int myArray[] = { 4, 16, 78, 81, 93, 99, 105, 190 }; // Array should already be sorted

		BinarySearch myObject = new BinarySearch();

		int num = 99;

		int pos = myObject.searchArray(myArray, num, 0, (myArray.length - 1));

		if (pos == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at " + (pos + 1) + " position");
		}
		
		System.out.println("---------------------------");
		
		pos = searchArray(myArray, num);
		
		if (pos == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at " + (pos + 1) + " position");
		}

	}

}