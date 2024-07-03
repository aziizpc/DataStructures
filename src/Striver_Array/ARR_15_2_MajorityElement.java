// n/3 times

package Striver_Array;

import java.util.ArrayList;
import java.util.List;

public class ARR_15_2_MajorityElement {

	public static List<Integer> getMajorityElement(int[] arr) {

		int count1 = 0;
		int elem1 = -1; // Some element not in the array

		int count2 = 0;
		int elem2 = -1;

		List<Integer> ans = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (count1 == 0 && arr[i] != elem2) { // NOTE!!!
				elem1 = arr[i];
				count1 = 1;
			}

			else if (count2 == 0 && arr[i] != elem1) { // NOTE!!!
				elem2 = arr[i];
				count2 = 1;
			}

			else if (arr[i] == elem1) {
				count1++;
			}

			else if (arr[i] == elem2) {
				count2++;
			}

			else {
				count1--;
				count2--;
			}

		}

		System.out.println(count1 + " times --> " + elem1);
		System.out.println(count2 + " times --> " + elem2);

		int min = (int) (arr.length / 3) + 1;
		System.out.println("min: " + min);

		count1 = 0;
		count2 = 0;

		for (int i = 0; i < arr.length; i++) { // Confirming steps followed
			if (arr[i] == elem1)
				count1++;
			if (arr[i] == elem2)
				count2++;
		}

		if (count1 >= min)
			ans.add(elem1);
		if (count2 >= min)
			ans.add(elem2);

		return ans;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 2, 1, 3, 1, 1, 3, 1, 1, 2, 2 };

		List<Integer> ans = getMajorityElement(arr);

		System.out.println(ans);

	}

}