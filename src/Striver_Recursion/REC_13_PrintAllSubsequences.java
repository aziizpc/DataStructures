package Striver_Recursion;

import java.util.ArrayList;
import java.util.List;

public class REC_13_PrintAllSubsequences {

	// public static List<List<Integer>> output = new ArrayList<List<Integer>>();

	public static void getSubsequence(int index, int len, int[] arr, List<Integer> temp, List<List<Integer>> output) {
		if (index == len) {
			output.add(new ArrayList<>(temp));	// Note new k/w
			return;
		}
		temp.add((arr[index]));
		getSubsequence(index + 1, len, arr, temp, output);
		temp.remove(temp.size() - 1);	// .size() - 1 
		getSubsequence(index + 1, len, arr, temp, output);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2 };

		int index = 0;
		int len = arr.length; // NOTE -> No -1
		List<Integer> temp = new ArrayList<Integer>();		
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		
		getSubsequence(index, len, arr, temp, output);

		System.out.println(output);
	}

}