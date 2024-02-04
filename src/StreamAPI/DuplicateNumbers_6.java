package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers_6 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 5, 3, 2890, 56, 5, 72, 2890, 22, -222, 56);

		Set<Integer> mySet = list.stream()
								.filter(e -> Collections.frequency(list, e) > 1)
								.collect(Collectors.toSet());

		System.out.println(mySet);

	}

}