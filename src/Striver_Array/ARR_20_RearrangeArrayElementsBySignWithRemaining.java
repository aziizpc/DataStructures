// Self - incorrect

// There will be elements left after arranging in Pos Neg Pos Neg ... (Means Neg may not be equal to Pos)

package Striver_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARR_20_RearrangeArrayElementsBySignWithRemaining {

	public static int[] rearrangeElements(int[] arr) {

		int n = arr.length;
		int[] ans = new int[n];
		List<Integer> myList = new ArrayList<Integer>();

		int negIndicator = 0;
		int posIndicator = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				myList.add(myList.size() - negIndicator, arr[i]);
				posIndicator++;
			}

			else {
				myList.add(arr[i]);
				negIndicator++;
			}
		}
		
		final int finalPosIndicator = posIndicator;
		final int finalNegIndicator = negIndicator;

		for (int i = 0; i <= (negIndicator <= posIndicator ? negIndicator : posIndicator); i++) {
			ans[i * 2] = myList.get(i);
			posIndicator--;
			ans[i * 2 + 1] = myList.get(myList.size() - negIndicator);
			negIndicator--;
		}

		System.out.println(posIndicator + " -- " + negIndicator);
		
		System.out.println(finalPosIndicator + " -- " + finalNegIndicator);

		for (int i = (negIndicator > posIndicator ? arr.length - negIndicator
				: arr.length - posIndicator); i < ans.length; i++) {
			//System.out.println("222");
			while (negIndicator != 0) {
				System.out.println("222");
				ans[i] = myList.get(negIndicator);
				negIndicator--;
			}
			while (posIndicator != 0) {
				System.out.println("111");
				ans[i] = myList.get(myList.size() - finalNegIndicator - posIndicator);
				posIndicator--;
			}

		}
		
		System.out.println(posIndicator + " ++ " + negIndicator);

		System.out.println(Arrays.toString(ans));

		return ans;

	}
	
	public static void main(String[] args) {

		int[] arr = { 1, 2, -4, -5, 3, 6 };

		int[] ans = rearrangeElements(arr);

		System.out.println(Arrays.toString(ans));

	}

}