// LC - 1593

package Striver_Recursion;

import java.util.HashSet;

public class REC_24_SplitAStringIntoTheMaxNumberOfUniqueSubstrings {
	
	public static int maxUniqueSplit(String s) {
        return backtrack(0, s, new HashSet<>());
    }

    private static int backtrack(int start, String s, HashSet<String> seen) {

        if (start == s.length()) {
            return 0; 
        }

        int maxSplits = 0;

        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (!seen.contains(substring)) {
                seen.add(substring); 
                maxSplits = Math.max(maxSplits, 1 + backtrack(end, s, seen));
                seen.remove(substring);
            }
        }
        
        return maxSplits;
    }

	public static void main(String[] args) {
		
		String s = "ababccc";		
		System.out.println(maxUniqueSplit(s));
		
		s = "aba";		
		System.out.println(maxUniqueSplit(s));
		
		s = "aa";		
		System.out.println(maxUniqueSplit(s));

	}

}
