package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Array_LongestSubarray_KXor {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 2, 6, 4 };
		int k = 6;

		allSubarraysCount(arr, k);

	}

	public static int allSubarraysCount(int[] arr, int k) {
		
		int xor = 0;

		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		myMap.put(xor, 1);
		
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			xor = xor ^ arr[i];
			int x = xor ^ k;

			if (myMap.containsKey(x)) {
				count = count + myMap.get(x);
			}

			myMap.put(xor, myMap.getOrDefault(xor, 0) + 1);;

		}
		
		System.out.println(myMap);

		System.out.println(count);
		
		return count;
	}

}