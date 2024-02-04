package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class PrintAList_11 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 5, 209, 298, 267, 89, 45, 33, 9, 12, 3, 2890, 56, 67, 72, 1, 22, -222);
		
		list.stream().forEach(e -> System.out.print(e + " "));

	}

}