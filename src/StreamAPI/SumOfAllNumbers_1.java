package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SumOfAllNumbers_1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 5, 89, 45, 33, 9, 12, 3, 56, 67, 72, 1);

		OptionalInt sum = list.stream().mapToInt(e -> e).reduce((a, b) -> a + b);	// .reduce

		System.out.println("Sum of numbers: " + sum.getAsInt());

	}

}