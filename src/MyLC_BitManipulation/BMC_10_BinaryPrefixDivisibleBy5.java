// LC - 1018

package MyLC_BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class BMC_10_BinaryPrefixDivisibleBy5 {
	
	public static List<Boolean> prefixesDivBy5(int[] nums) {

        List<Boolean> al = new ArrayList<Boolean>();

        int num = 0;

        for (int i : nums){
        	//System.out.println("num start: " + num);
            num <<= 1;
            //System.out.println("num shift: " + num);
            num = num | i;
            //System.out.println("num or: " + num);
            num = num % 5;							// This is IMPORTANT !!! This value goes to loop start.
            //System.out.println("num %: " + num);
            if (num == 0){
                al.add(true);
            }
            else al.add(false);
            System.out.println("----------------------");
        }

        return al;
                
    }

	public static void main(String[] args) {
		
		int[] arr = {0,1,1};
		
		/*
		 * 0, 01, 01: true, false, false
		 */
		
		System.out.println(prefixesDivBy5(arr));

	}

}
