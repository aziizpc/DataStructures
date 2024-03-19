// LC - 131

package MyLC_String;

import java.util.ArrayList;
import java.util.List;

public class STR_13_PalindromePartitioning {
	
	public static List<List<String>> partition(String s) {

        List<List<String>> ans = new ArrayList<List<String>>();
        int len = s.length();

        getPartitions(0, s, len, new ArrayList<String>(), ans);

        return ans;
          
    }

    public static void getPartitions(int index, String s, int len, List<String> temp, List<List<String>> ans){
        if (index == len){
            ans.add(new ArrayList<String> (temp));
            return;
        }

        for (int i = index ; i < len ; i++){
            if (checkPalindrome (s, index, i)){
                temp.add(s.substring(index, i + 1));
                getPartitions(i + 1, s, len, temp, ans);	// NOTE temp
                temp.remove(temp.size() - 1);
            }
        }

    }

    public static boolean checkPalindrome (String s, int start, int end){
        char[] arr = s.toCharArray();
        while (start < end){
            if (arr[start++] != arr[end--]) return false;
        }
        return true;
    }

	public static void main(String[] args) {
		
		String s = "malayalam";
		
		System.out.println(partition(s));

	}

}