package SDETSheet;

import java.util.*;

class SDET_003_GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();

		for (String s : strs) {
			// Build a frequency count key for each string
			int[] count = new int[26];
			for (char c : s.toCharArray()) {
				count[c - 'a']++;
			}
			// Convert frequency array to a string key
			String key = Arrays.toString(count);

			// Add to hashmap
			map.putIfAbsent(key, new ArrayList<>());
			map.get(key).add(s);
		}

		// Return grouped anagrams
		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(arr));
	}
}