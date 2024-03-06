package Striver_Array;

import java.util.Arrays;

public class ARR_3_LeftRotation {
	
	public static int[] leftRotate(int[] arr) {
		int first = arr[0];
		for (int i = 1 ; i < arr.length ; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = first;
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 7, 0, 1, -5, 9, 3 }; //O/P should be { 7, 0, 1, -5, 9, 3, 3 } 
		leftRotate(arr);
		System.out.println(Arrays.toString(arr));
	}

}
