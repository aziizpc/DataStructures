package SDETSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SDET_035_RemoveDuplicatesFromAList {

	public static List<Integer> removeDup(List<Integer> al) {
		// Use LinkedHashSet to preserve insertion order while removing duplicates
		Set<Integer> hs = new LinkedHashSet<>(al);
		return new ArrayList<>(hs);
	}

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(4, 7, 8, 4, 0, 0, 7, 3, 1, 4, 9);
		System.out.println(removeDup(al));
	}
}