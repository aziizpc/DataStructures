package Striver_Array;

public class ARR_1_SecondLargestNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 7, 7, -1, -4, 11, 5, 8, 2, 10, 9 };
		System.out.println(getSecondLargest(arr));
	}

	public static int getSecondLargest(int[] arr) {
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {				// Case: Larger value than 'largest' comes
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > secondLargest) { // Case: Smaller value than 'largest' ..
				secondLargest = arr[i];								 // and larger than 'secondLargest' seen
			}
		}

		return secondLargest;
	}

}