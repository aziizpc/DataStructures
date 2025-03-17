package SDETSheet;

import java.util.*;

public class SDET_030_SortArrayInReverseOrder {
    
    public static Integer[] sortArray (Integer[] arr){
        
        Comparator<Integer> comp = new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                //return b.compareTo(a);		// Works :)
            	return Integer.compare(b, a);	// Both works :)
            }
        };
        
        Arrays.sort(arr, comp);
        
        return arr;
        
    }

    public static void main(String[] args) {
        
        Integer[] arr = {1, 2, 3, 4, 5};
        
        sortArray(arr);
        
        System.out.println(Arrays.toString(arr));
    }
}