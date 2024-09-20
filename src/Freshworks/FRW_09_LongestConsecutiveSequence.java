// LC - 128

package Freshworks;

import java.util.HashSet;
import java.util.Set;

public class FRW_09_LongestConsecutiveSequence {

	public static int getLongestConSequence(int[] arr) {

		Set<Integer> mySet = new HashSet<Integer>();			// Set

		int longest = 0;										// Set 'longest' as 0

		for (int i : arr) {										// Add all elements to the Set
			mySet.add(i);
		}

		for (Integer i : mySet) {								// Loop the Set (We need to find sequence start)
			if (mySet.contains(i - 1)) {						// Check if the previous element is PRESENT
				continue;										// If yes, go to next
			}

			else {												// If previous element NOT PRESENT => Start
				int temp = i; 									// Save that as first element
				int count = 0;									// Counter
				while (mySet.contains(temp)) {					// Keep checking the next element is present
					count++;
					temp++;
				}
				longest = Math.max(count, longest);				// Get the maximum
			}
		}

		return longest;

	}

	public static void main(String[] args) {
		int[] arr = { 102, 4, 100, 1, 4, 101, 3, 2, 1, 1, 5 };

		System.out.println(getLongestConSequence(arr));

	}

}