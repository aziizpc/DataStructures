package Array_Striver;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubArraysWithXorK_28 {

	public static int getCountOfSubArrays(int[] arr, int k) {

		int xor = 0;
		int count = 0;

		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

		myMap.put(0, 1);

		for (int i = 0; i < arr.length; i++) {

			xor = xor ^ arr[i];

			int calc = xor ^ k;

			if (myMap.containsKey(calc)) {
				count += myMap.get(calc);
			}

			myMap.put(xor, myMap.getOrDefault(xor, 0) + 1);

		}
		
		System.out.println(myMap);

		return count;

	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 6, 4 };

		int k = 6;

		System.out.println(getCountOfSubArrays(arr, k));

	}

}