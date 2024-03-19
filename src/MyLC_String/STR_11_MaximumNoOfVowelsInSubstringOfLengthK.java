package MyLC_String;

public class STR_11_MaximumNoOfVowelsInSubstringOfLengthK {

	public static int getTheVowelsCount(String s, int k) {

		int[] vowels = new int[128];

		vowels['a'] = 1;
		vowels['e'] = 1;
		vowels['i'] = 1;
		vowels['o'] = 1;
		vowels['u'] = 1;

		int n = s.length();
		int count = 0;
		int maxCount = 0;

		for (int i = 0; i < k; i++) { // Get the first substring count
			count += vowels[s.charAt(i)]; // NOTE!! charAt
		}

		if (count == k)
			return k; // Return k if the first substring itself has k vowels

		maxCount = count; // Assign count to maxCount

		for (int i = k; i < n; i++) {
			count += vowels[s.charAt(i)] - vowels[s.charAt(i - k)]; // Note: Sliding window // NOTE!! charAt
			if (count == k)
				return k;
			else
				maxCount = Math.max(maxCount, count);
		}

		return maxCount;

	}

	public static void main(String[] args) {

		String s = "leetcode"; // "lee", "eet" and "ode" contain 2 vowels
		int k = 3;

		System.out.println(getTheVowelsCount(s, k));

	}

}