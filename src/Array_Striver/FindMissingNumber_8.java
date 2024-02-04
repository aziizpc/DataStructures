package Array_Striver;

public class FindMissingNumber_8 {

	public static int getMissing(int[] arr, int n) {
		int xor1 = 0;
		int xor2 = 0;

		for (int i = 0; i < arr.length; i++) {
			xor1 = xor1 ^ arr[i];
			xor2 = xor2 ^ (i + 1);
		}

		xor2 = xor2 ^ n;

		return xor1 ^ xor2;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 7, 8 };

		int n = 8;

		System.out.println(getMissing(arr, n));

	}

}