package Array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JoinTwoArrays {

	public static void main(String[] args) {

		String myArray1[] = { "Poda", "Poyi", "vere", "valla", "work", "nokkedaaa" };
		String myArray2[] = { "enje", "Kond", "Onnum", "pattillaaa" };

		Stream<String> streamOfmyArray1 = Arrays.stream(myArray1); // Convert Array to Stream (No 'To.')
		Stream<String> streamOfmyArray2 = Arrays.stream(myArray2);

		String myArrayString[] = Stream.concat(streamOfmyArray1, streamOfmyArray2)
				.toArray(myCombinedSize -> new String[myCombinedSize]); // Combine the Streams and convert to Array

		for (String s : myArrayString) {
			System.out.print(s + " ");
		}

		System.out.println("\n\n--------------------------------------------------------------------------------\n\n");

		int myArray3[] = { 56, 90, 1, 2, 45 };
		int myArray4[] = { 5, 43, 2, 12, 90 };

		Integer[] myArray5 = Arrays.stream(myArray3).boxed().toArray(Integer[]::new); // int[] -> Integer[]
		Integer[] myArray6 = Arrays.stream(myArray4).boxed().toArray(Integer[]::new); // int[] -> Integer[]

		Stream<Integer> streamOfmyArray3 = Arrays.stream(myArray5);
		Stream<Integer> streamOfmyArray4 = Arrays.stream(myArray6);

		Integer myArrayInteger[] = Stream.concat(streamOfmyArray3, streamOfmyArray4)
				.toArray(myCombinedSize -> new Integer[myCombinedSize]);

		int[] myArrayInt = Arrays.stream(myArrayInteger).mapToInt(e -> e).toArray();	// Integer -> int (After concatenation)

		for (Integer i : myArrayInt) {
			System.out.print(i + " ");
		}

	}

}