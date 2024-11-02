// LC - 179

package SN;

import java.util.Arrays;
import java.util.Comparator;

public class SCN_004_LargestNumber {

	public static String largestNumber(int[] nums) {

		String[] arr = new String[nums.length];

		for (int i = 0; i < nums.length; i++) {
			arr[i] = String.valueOf(nums[i]);
		}

		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				String s1 = str1 + str2;
				String s2 = str2 + str1;
				return s2.compareTo(s1);
			}
		};

		Arrays.sort(arr, comp);

		if (arr[0].charAt(0) == '0')
			return "0";

		StringBuilder sb = new StringBuilder();

		for (String s : arr) {
			sb.append(s);
		}

		return sb.toString();

	}
	
	public static void main(String[] args) {
		
		int[] nums = {3,30,34,5,9};
		
		System.out.println(largestNumber(nums));
	}

}