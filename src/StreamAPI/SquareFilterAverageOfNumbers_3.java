// Self

package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class SquareFilterAverageOfNumbers_3 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 5, 89, 45, 33, 9, 12, 3, 56, 67, 72, 1);
		
		int[] squareArray = list.stream().map(e -> e*e).mapToInt(e -> e).toArray();		// SQUARE
		
		for (Integer i : squareArray) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------------------------");
		
		int[] squareArrayWithValueGreaterThan100 = list.stream().map(e -> e*e).mapToInt(e -> e).filter(e -> e > 100).toArray();
		
		for (Integer i : squareArrayWithValueGreaterThan100) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------------------------");
		
		double squareArrayWithValueGreaterThan100Average = list.stream().map(e -> e*e).mapToInt(e -> e).filter(e -> e > 100).average().getAsDouble();
		
		System.out.println(squareArrayWithValueGreaterThan100Average);
	}

}