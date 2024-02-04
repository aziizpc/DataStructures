package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbersAscDesc_8 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 5, 209, 298, 267, 89, 45, 33, 9, 12, 3, 2890, 56, 67, 72, 1, 22, -222);

		List<Integer> ascList = list.stream()
									.sorted()
									.collect(Collectors.toList());

		System.out.println(ascList);

		List<Integer> descList = list.stream()
									.sorted(Collections.reverseOrder())
									.collect(Collectors.toList());

		System.out.println(descList);

	}

}