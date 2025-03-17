package SDETSheet;

import java.util.Arrays;
import java.util.Comparator;

public class SDET_029_SortStringArrayBasedOnElementsLength {
	
public static void main(String[] args) {
        
        String[] str = {"ab", "a", "abcde", "abcd", "", "ab"};
        
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                Integer l1 = s1.length();
                Integer l2 = s2.length();
                return l1.compareTo(l2);
            }
        };
        
        Arrays.sort(str, comp);
        
        System.out.println(Arrays.toString(str));
    }

}