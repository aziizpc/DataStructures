// LC - 179

package MyLC_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class AML_25_LargestNumber {

	public static String largestNumber(int[] nums) {

		String[] arr = new String[nums.length];			// String array

		for (int i = 0; i < nums.length; i++) {			// Convert the above number array to string
			arr[i] = String.valueOf(nums[i]);
		}

		Comparator<String> comp = new Comparator<String>() {	// Comparator
			@Override
			public int compare(String str1, String str2) {
				String s1 = str1 + str2;
				String s2 = str2 + str1;
				return s2.compareTo(s1);
			}
		};

		Arrays.sort(arr, comp);							// Sort it

		if (arr[0].charAt(0) == '0')					// Edge case for Leetcode
			return "0";

		StringBuilder sb = new StringBuilder();

		for (String s : arr) {							// Just append
			sb.append(s);
		}

		return sb.toString();

	}
	
	public static void main(String[] args) {
		
		int[] nums = {3,30,34,5,9};
		
		System.out.println(largestNumber(nums));
	}

}