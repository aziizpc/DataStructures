package Striver_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ARR_29_MergeOverlappingIntervals {

	public static List<int[]> getMergedOutput(int[][] arr) {

		List<int[]> ans = new ArrayList<int[]>();

		Arrays.sort(arr, Comparator.comparingInt(i -> i[0])); 	// Sort based on the first element in the pair

		System.out.println(Arrays.deepToString(arr));

		for (int i = 0; i < arr.length; i++) {

			if (ans.isEmpty()) { 								// If the list is empty
				ans.add(arr[i]);
			}

			else if (ans.size() > 0 && arr[i][0] > ans.get(ans.size() - 1)[1]) { // Consider this: [2, 4], [8, 9] --> 4
																				// < 8. Therefore, add.
				ans.add(arr[i]);
			}

			else { // All other cases: Consider -> [1, 3], [2, 6] :: 3 < 6. Therefore, 'set' 6 in
					// the place of 3 (as 6 is Max).
				ans.set(ans.size() - 1,
						new int[] { ans.get(ans.size() - 1)[0], Math.max(ans.get(ans.size() - 1)[1], arr[i][1]) });
			}
		}

		return ans;

	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 3 }, { 2, 6 }, { 15, 18 }, { 8, 9 }, { 9, 11 }, { 8, 10 }, { 2, 4 }, { 16, 17 } };

		// Ans: [[1, 6], [8, 11], [15, 18]]

		List<int[]> ans = getMergedOutput(arr);

		for (int i = 0; i < ans.size(); i++) {
			int[] nums = ans.get(i);
			System.out.println(Arrays.toString(nums));
		}

	}

}