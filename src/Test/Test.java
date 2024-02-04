package Test;

import java.util.Arrays;
import java.util.Comparator;

class Test {
    public static void main(String[] args) {
        
        int[][] arr = {{78},{4,64},{91, 0}, {0, 900}, {67}};
       
        Arrays.sort(arr, Comparator.comparingInt(e -> e[0]));
        
        System.out.println(Arrays.deepToString(arr));
        
        char[] arr1 = new char[5];
        
        arr1[0] = 'a';
        
        System.out.println(Arrays.toString(arr1));
    }
}