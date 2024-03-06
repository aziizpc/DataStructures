package Striver_Array;

import java.util.HashSet;
import java.util.Set;

public class ARR_24_LongestConsecutiveSequence {

	public static int getLongestConSequence(int[] arr) {

		Set<Integer> mySet = new HashSet<Integer>();

		int longest = 0;

		for (int i : arr) {
			mySet.add(i);
		}

		for (Integer i : mySet) {
			if (!mySet.contains(i - 1)) {
				continue;
			}

			else {
				int temp = i - 1; // Start from the first element :)
				int count = 0;
				while (mySet.contains(temp)) {
					count++;
					temp++;
				}
				longest = Math.max(count, longest);
			}
		}

		return longest;

	}

	public static void main(String[] args) {
		int[] arr = { 102, 4, 100, 1, 4, 101, 3, 2, 1, 1 };

		System.out.println(getLongestConSequence(arr));

	}

}