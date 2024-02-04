package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestOrLowestNumber_10 {

	public static void main(String[] args) {
		
		Integer[] arr = {1, 2, 5, 209, 298, 267, 89, 45, 33, 9, 12, 3, 2890, 56, 67, 72, 1, 22};

		List<Integer> list = Arrays.asList(arr);
		
		int secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();	// .findFirst()
		System.out.println(secondHighest);
		
		int secondLowest = list.stream().sorted().distinct().skip(1).findFirst().get();	// .findFirst()
		System.out.println(secondLowest);
		
	}

}