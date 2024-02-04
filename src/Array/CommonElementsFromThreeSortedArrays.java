package Array;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsFromThreeSortedArrays {

	public static void findCommonElements(int a[], int b[], int c[]) {
		Set<Integer> aSet = convertArrayToSet(a);
		Set<Integer> bSet = convertArrayToSet(b);
		Set<Integer> cSet = convertArrayToSet(c);

		Set<Integer> common1 = findCommonElementsInSet(aSet, bSet);
		Set<Integer> common2 = findCommonElementsInSet(common1, cSet);

		System.out.println("Common Elements: " + common2);

	}

	public static Set<Integer> convertArrayToSet(int array[]) {
		Set<Integer> arraySet = new HashSet<Integer>();
		for (Integer i : array) {
			arraySet.add(i);
		}
		return arraySet;
	}

	public static Set<Integer> findCommonElementsInSet(Set<Integer> firstSet, Set<Integer> secondSet) {
		Set<Integer> commonSet = new HashSet<Integer>();
		for (Integer i : firstSet) {
			if (secondSet.add(i) == false) {
				commonSet.add(i);
			}
		}
		return commonSet;
	}

	public static void main(String[] args) {

		int a[] = { 90, 87, 65, 32, 17, 15, 11, 5, 4, 0 };
		int b[] = { 101, 100, 90, 87, 77, 65, 54, 34, 32, 9, 1 };
		int C[] = { 150, 120, 100, 90, 88, 87, 66, 50, 32 };

		findCommonElements(a, b, C);

	}

}