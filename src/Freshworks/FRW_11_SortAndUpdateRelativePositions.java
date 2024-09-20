package Freshworks;

import java.util.Arrays;
import java.util.Comparator;

public class FRW_11_SortAndUpdateRelativePositions {

	public static void main(String[] args) {
        int[] arr1 = {5, 0, 7, 1};
        int[] arr2 = {4, 2, 1, 3};
        String[] arr3 = {"Zebra", "Grape", "Apple", "Cake"};

        // Create an array of indices									// {0, 1, 2, 3}
        Integer[] indices = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            indices[i] = i;
        }

        // Sort indices based on the values in arr1
        Arrays.sort(indices, Comparator.comparingInt(i -> arr1[i]));	// {1, 3, 0, 2}

        // Create new arrays for the sorted result
        int[] sortedArr1 = new int[arr1.length];
        int[] sortedArr2 = new int[arr2.length];
        String[] sortedArr3 = new String[arr3.length];

        // Fill the sorted arrays based on sorted indices
        for (int i = 0; i < indices.length; i++) {
            sortedArr1[i] = arr1[indices[i]];
            sortedArr2[i] = arr2[indices[i]];
            sortedArr3[i] = arr3[indices[i]];
        }

        // Print the sorted arrays
        System.out.println("Sorted arr1: " + Arrays.toString(sortedArr1));
        System.out.println("Sorted arr2: " + Arrays.toString(sortedArr2));
        System.out.println("Sorted arr3: " + Arrays.toString(sortedArr3));
    }

}