package String;

import java.util.HashMap;

public class FrequencyOfCharacters {

	public static void main(String[] args) {

		String s = "fhgfhgdgfdghhjewqakjnmbnbvdxcz5465";

		HashMap<Character, Integer> myMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			myMap.put(c, myMap.getOrDefault(c, 0) + 1);
		}
		System.out.println(myMap);
	}

}