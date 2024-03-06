// LC 791 Self

package MyLC_String;

import java.util.HashMap;
import java.util.Map;

public class STR_3_CustomSortString {

	public static String customSortString(String order, String s) {

		Map<Integer, Character> hm1 = new HashMap<Integer, Character>();	// For Index in order
		Map<Character, Integer> hm2 = new HashMap<Character, Integer>();	// For count in s

		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (order.contains(c + "")) {
				int index = order.indexOf(c);
				if (!hm1.containsKey(index)) {
					hm1.put(index, c);
					hm2.put(c, 1);
				} else
					hm2.put(c, hm2.getOrDefault(c, 0) + 1);
			}
		}

		int ind = -1;

		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (hm2.containsKey(c)) {
				while (!hm1.containsKey(ind)) {	// Find the next lowest key available in hm1
					ind++;
					break;
				}
				char key = hm1.get(ind);
				int val = hm2.get(key);
				arr[i] = key;	// Replace
				val--;
				hm2.put(key, val);	// Update the decremented count
				if (val == 0)
					ind++;		// Increment ind
			}
		}

		return new String(arr);

	}

	public static void main(String[] args) {

		String order = "cba";
		String s = "abcd";
		
		System.out.println(customSortString(order, s));

	}

}