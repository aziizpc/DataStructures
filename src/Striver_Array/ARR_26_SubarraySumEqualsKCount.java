package Striver_Array;

import java.util.HashMap;
import java.util.Map;

public class ARR_26_SubarraySumEqualsKCount {

	public static int getSubArrayCount(int[] arr, int k) {

		int count = 0;
		int sum = 0;

		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (sum == k)
				count++;

			int diff = sum - k;
			if (myMap.containsKey(diff)) {
				count += myMap.get(diff);
			}

			myMap.put(sum, myMap.getOrDefault(sum, 0) + 1);
		}
		
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
		int k = 3;
		
		System.out.println(getSubArrayCount(arr, k));

	}

}