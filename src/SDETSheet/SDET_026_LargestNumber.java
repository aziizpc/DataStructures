package SDETSheet;

import java.util.Arrays;
import java.util.Comparator;

public class SDET_026_LargestNumber {

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
				return s1.compareTo(s2);
			}
		};

		Arrays.sort(arr, comp);
		
		System.out.println(Arrays.toString(arr));

		if (arr[arr.length - 1].charAt(0) == '0')
			return "0";

		StringBuilder sb = new StringBuilder();

		for (String s : arr) {
			sb.insert(0, s);
		}

		return sb.toString();

	}
	
	public static void main(String[] args) {
		int[] nums = {8, 0, 67, 45, 12, 765};
		
		System.out.println(largestNumber(nums));
	}
}