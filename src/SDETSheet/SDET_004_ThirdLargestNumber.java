package SDETSheet;

public class SDET_004_ThirdLargestNumber {

	public static int getThirdLargest(int[] arr) {
		int n = arr.length;

		if (n < 3) {
			throw new IllegalArgumentException("Array must have at least 3 elements.");
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;

		for (int val : arr) {
			if (val > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = val;
			} else if (val > secondLargest && val < largest) {
				thirdLargest = secondLargest;
				secondLargest = val;
			} else if (val > thirdLargest && val < secondLargest) {
				thirdLargest = val;
			}
		}

		return thirdLargest;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 3, 6, 1000 };
		System.out.println(getThirdLargest(arr)); // Output: 6
	}
}
