package Array;

import java.util.Arrays;

public class Sort_Quick {

	public static void main(String[] args) {
		int myArray[] = { 67, -20, 40, 1, 4, 0, 11, -1, 9, 8, 100 };
		System.out.println("Before Quick Sort: " + Arrays.toString(myArray));
		int low = 0, high = myArray.length - 1;
		quickSort(myArray, low, high);
		System.out.println("After Quick Sort: " + Arrays.toString(myArray));
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) { // That means there are more than one element in the array
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high) {
		int i = low;
		int j = high;
		int pivot = arr[low];
		while (i < j) {
			while (arr[i] < pivot && i <= high - 1) { // Why high - 1? We don't want i to cross the array length
				i++;
			}
			while (arr[j] >= pivot && j >= low + 1) { // Same reason
				j--;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = pivot;
		pivot = arr[j];
		arr[j] = temp;

		return j;

	}
}