// LC - 1497

package MyLC_Arrays;

public class AML_20_CheckIfArrayPairsAreDivisibleByK {

	public static boolean canArrange(int[] arr, int k) {

		int[] freq = new int[k];

		for (int num : arr) {
			num = num % k;
			if (num < 0)
				num += k;
			freq[num]++;
		}

		// System.out.println(Arrays.toString(freq));

		if (freq[0] % 2 != 0)
			return false;

		for (int i = 1; i <= (k / 2); i++) {
			if (freq[i] != freq[k - i])
				return false;
		}

		return true;

	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 10, 6, 7, 8, 9 };
		int k = 5;
		System.out.println(canArrange(arr1, k));

		int[] arr2 = { 1, 2, 3, 4, 5, 6 };
		k = 10;
		System.out.println(canArrange(arr2, k));

	}

}
