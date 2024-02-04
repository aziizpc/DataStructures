package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class AverageOfAllNumbers_2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 5, 89, 45, 33, 9, 12, 3, 56, 67, 72, 1);

		double average = list.stream().mapToInt(e -> e).average().getAsDouble();	// .mapToInt -> Convert all stream objects to intStream

		System.out.println("Average: " + average);

	}

}