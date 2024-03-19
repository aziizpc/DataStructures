// LC-132

package MyLC_String;

import java.util.ArrayList;
import java.util.List;

public class STR_14_PalindromicPartitioning {

	public static int minCut(String s) {
		List<List<String>> ans = new ArrayList<List<String>>();
		int len = s.length();
		//int min = s.length() - 1;
		int index = 0;
		List<Integer> al = new ArrayList<Integer>();

		getPartitions(index, s, len, new ArrayList<String>(), ans, al);
		
		System.out.println(al);

		return 0;

	}

	public static void getPartitions(int index, String s, int len, List<String> temp, List<List<String>> ans, List<Integer> al) {

		if (index == len) {
			al.add(temp.size() - 1);
			ans.add(new ArrayList<String> (temp));
			return;
		}

		for (int i = index; i < len; i++) {
			if (checkPalindrome(s, index, i)) {
				temp.add(s.substring(index, i + 1));
				getPartitions(i + 1, s, len, temp, ans, al);
				temp.remove(temp.size() - 1);
			}
		}
	}

	public static boolean checkPalindrome(String s, int start, int end) {
		char[] arr = s.toCharArray();
		while (start < end) {
			if (arr[start++] != arr[end++])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "aab";
		System.out.println(minCut(s));

	}

}