package SDETSheet;

import java.util.LinkedHashSet;
import java.util.Set;

public class SDET_036_RemoveDuplicatesFromAString {

	public static void main(String[] args) {

		String s = "777665567AfgvgvbAbvbbv hhb hjhjh azeez";

		// Use LinkedHashSet to maintain order and remove duplicates
		Set<Character> set = new LinkedHashSet<>();
		StringBuilder ans = new StringBuilder(); // Optimized string builder

		for (char c : s.toCharArray()) {
			if (set.add(c)) { 	// Add returns false if element is already present
				ans.append(c); 	// Append to StringBuilder (O(1))
			}
		}

		System.out.println(ans.toString());
	}
}