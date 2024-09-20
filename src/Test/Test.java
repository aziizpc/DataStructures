package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Test {

public static List<List<Integer>> getFourElementsSum(int[] arr, int k){
        
        Arrays.sort(arr);
        
        int n = arr.length;
        
        List<List<Integer>> op = new ArrayList<List<Integer>>();
        
        for (int i = 0 ; i <= (n - 4) ; i++){
            for (int j = (i + 1) ; j <= (n - 3) ; j++){
                int left = (j + 1);
                int right = n - 1;
                while (left < right){
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    
                    if (sum == k){
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[left]);
                        temp.add(arr[right]);
                        op.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                    }
                    else if (sum < k){
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }
        
        return op;
        
    }
    
    public static void main(String[] args) {
        int[] arr = { 5, 5, 5, 1, 1, 1, 2, 2, 2, 4, 4, 4, 3, 3, 3, 2 };

		int k = 8;

		List<List<Integer>> ans = getFourElementsSum(arr, k);

		System.out.println(ans);

    }
}