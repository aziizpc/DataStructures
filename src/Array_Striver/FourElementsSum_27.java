// CHECK LC 18

package Array_Striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourElementsSum_27 {

	public static List<List<Integer>> getFourElementsSum(int[] arr, int k) {

		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		Arrays.sort(arr);

		for (int i = 0; i <= arr.length - 4; i++) { // NOTE!!!

			if (i > 0 && arr[i] == arr[i - 1])
				continue;

			for (int j = i + 1; j <= arr.length - 3; j++) { // NOTE!!!

				if (j != (i + 1) && arr[j] == arr[j - 1]) // NOTE!!! --> j != (i + 1)
					continue;

				int left = j + 1;
				int right = arr.length - 1;

				while (left < right) {

					int sum = arr[i] + arr[j] + arr[left] + arr[right];

					if (sum == k) {
						List<Integer> temp = new ArrayList<Integer>();
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[left]);
						temp.add(arr[right]);
						ans.add(new ArrayList<Integer>(temp));
						left++;
						right--;
						while (arr[left] == arr[left - 1])
							left++;
						while (arr[right] == arr[right + 1])
							right--;
					}

					else if (sum < k) {
						left++;
						//while (arr[left] == arr[left - 1])
							//left++;
					}

					else {
						right--;
						//while (arr[right] == arr[right + 1])
							//right--;
					}

				}

			}

		}

		return ans;

	}

	public static void main(String[] args) {

		int[] arr = { 5, 5, 5, 1, 1, 1, 2, 2, 2, 4, 4, 4, 3, 3, 3, 2 };

		int k = 8;

		List<List<Integer>> ans = getFourElementsSum(arr, k);

		System.out.println(ans);

	}

}
