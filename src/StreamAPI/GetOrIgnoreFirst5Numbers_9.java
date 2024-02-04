package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GetOrIgnoreFirst5Numbers_9 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 5, 209, 298, 267, 89, 45, 33, 9, 12, 3, 2890, 56, 67, 72, 1, 22, -222);
		
		List<Integer> limit5 = list.stream().limit(5).collect(Collectors.toList());		
		System.out.println(limit5);
		
		System.out.println("------------------------------------------");
		
		Optional<Integer> limit5Sum = list.stream().limit(5).reduce((a, b) -> a + b);		
		System.out.println(limit5Sum.get());
		
		System.out.println("------------------------------------------");
		
		List<Integer> skip5 = list.stream().skip(5).collect(Collectors.toList());
		System.out.println(skip5);
		
		System.out.println("------------------------------------------");
		
		Optional<Integer> skip5Sum = list.stream().skip(5).reduce((a, b) -> a + b);		
		System.out.println(skip5Sum.get());

	}

}