package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartsWithPrefix2_5 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 5, 209, 298, 267, 89, 45, 33, 9, 12, 3, 2890, 56, 67, 72, 1, 22, -222);
		
		List<Integer> myList = list.stream()
								.map(e -> String.valueOf(e))
								.filter(e -> e.startsWith("2"))
								.map(e -> Integer.parseInt(e))
								.collect(Collectors.toList());
		
		System.out.println(myList);
		
		List<Integer> myListWithNegative = list.stream()
											.map(e -> String.valueOf(e))
											.filter(e -> e.startsWith("2") || e.startsWith("-2"))
											.map(e -> Integer.parseInt(e))
											.collect(Collectors.toList());
		
		System.out.println(myListWithNegative);

	}

}