package Array_Striver;

public class SecondLargestNumber_1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 7, 7, -1, -4, 11, 5, 8, 2, 10, 9 };
		System.out.println(getSecondLargest(arr));
	}

	public static int getSecondLargest(int[] arr) {
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > secondLargest) { // If secondLargest comes after largest
				secondLargest = arr[i];
			}
		}

		return secondLargest;
	}

}