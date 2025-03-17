package Test;

import java.util.ArrayList;
import java.util.List;

public class REC_23_Permutation {

	public static void getPerm(int index, int len, int[] arr, boolean[] freq, List<Integer> temp,
			List<List<Integer>> ans) {
		if (temp.size() == len) {
			ans.add(new ArrayList<Integer>(temp));
			return;
		}

		for (int i = 0; i < len; i++) {
			if (freq[i] == false) {
				temp.add(arr[i]);
				freq[i] = true;
				getPerm(i + 1, len, arr, freq, temp, ans);
				temp.remove(temp.size() - 1);
				freq[i] = false;
			}

		}

	}

	public static List<List<Integer>> permute(int[] nums) {
		int index = 0;
		int len = nums.length;
		List<Integer> temp = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		boolean[] freq = new boolean[nums.length];	// frequency array (boolean)
		getPerm(index, len, nums, freq, temp, ans);

		return ans;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		System.out.println(permute(nums));

	}

}