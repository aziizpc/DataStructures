// Moore's Voting Algorithm: If > (n/2) occurrence EXISTS, then the o/p is the ans

package Array_Striver;

public class MajorityElement_15_1 {

	public static int getMajorityElement(int[] arr) {

		int count = 0;
		int elem = -1;	// Some element not in the array

		for (int i = 0; i < arr.length; i++) {
			if (count == 0) {
				elem = arr[i];
				count = 1;
			}

			if (arr[i] == elem)
				count++;
			else
				count--;
		}

		int ansCount_final = 0;

		for (int i = 0; i < arr.length; i++) {	// We are making sure 'elem' is the right answer 
			if (arr[i] == elem) {
				ansCount_final++;
			}
			if (ansCount_final > (arr.length / 2))
				return elem;
		}

		return elem;

	}

	public static void main(String[] args) {
		int[] arr = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5 };

		int ans = getMajorityElement(arr);

		System.out.println(ans);

	}

}