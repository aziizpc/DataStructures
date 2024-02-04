package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOddNumbers_4 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(4, 8, 1, 5, 89, 45, 33, 9, 12, 3, 56, 67, 72, 1);

		int[] evenArray = list.stream().filter(e -> (e % 2 == 0)).mapToInt(e -> e).toArray(); // Even as array

		for (int i : evenArray) {
			System.out.println(i);
		}

		List<Integer> evenList = list.stream().filter(e -> (e % 2 == 0)).collect(Collectors.toList()); // Even as list

		System.out.println(evenList);

		System.out.println("-------------------------------------------------------");

		int[] oddArray = list.stream().filter(e -> (e % 2 != 0)).mapToInt(e -> e).toArray(); // Odd as array

		for (int i : oddArray) {
			System.out.println(i);
		}

		List<Integer> oddList = list.stream().filter(e -> (e % 2 != 0)).collect(Collectors.toList()); // Odd as list

		System.out.println(oddList);

	}

}