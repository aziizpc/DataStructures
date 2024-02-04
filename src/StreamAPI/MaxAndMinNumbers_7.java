package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxAndMinNumbers_7 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 5, 209, 298, 267, 89, 45, 33, 9, 12, 3, 2890, 56, 67, 72, 1, 22, -222);
		
		int max = list.stream().max(Integer::compare).get();		
		System.out.println(max);
		
		int min = list.stream().min(Integer::compare).get();		
		System.out.println(min);		

	}

}