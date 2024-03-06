package Striver_Array;

public class ARR_10_FindNumberThatAppearsOnlyOnceOthersTwice {

	public static int getNumber(int[] arr) {

		int xor = 0;

		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}

		return xor;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 5, 8, 0, 6, 1, 0, 8 }; // OP: 6

		System.out.println(getNumber(arr));

	}

}