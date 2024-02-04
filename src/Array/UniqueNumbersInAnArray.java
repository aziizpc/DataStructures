package Array;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueNumbersInAnArray {

	public static void main(String[] args) {

		int[] array = { 0, 56, 78, 34, 78, 0, 89, 54, 32, 34 };

		HashSet<Integer> mySet = new HashSet<>();

		for (int i = 0; i < array.length; i++) {
			mySet.add(array[i]);
		}

		System.out.println(mySet);
		
		Object[] objectArray = mySet.toArray();
		
		int[] intArray = mySet.stream().mapToInt(e -> e).toArray();
		
		System.out.println("Object Array: " + Arrays.toString(objectArray));
		
		System.out.println("Integer Array: " + Arrays.toString(intArray));

	}

}