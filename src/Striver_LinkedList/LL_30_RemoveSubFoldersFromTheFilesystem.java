// LC - 1233

package Striver_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LL_30_RemoveSubFoldersFromTheFilesystem {
	
	public static List<String> removeSubfolders(String[] folder) {

        LinkedList<String> ans = new LinkedList<>();						// Create the answer LL
        
        Arrays.sort(folder);												// Sort the array
        
        /* Add to LL in the following cases:
         * 	1. When the LL is empty.
         *  2. Get the last element from LL & append '/'. If the current string DOES NOT START WITH THAT.
         *  
         * Notes:
         *  1. .peekLast()
         *  2. .offer()
         */
        
        for (String f : folder)												// Loop the array
        	
            if ((ans.isEmpty()) || (!f.startsWith(ans.peekLast() + '/'))) 	//  need '/' to ensure a parent
            	
                ans.offer(f);												// Similar to 'add' method
        
        return ans;
    }

	public static void main(String[] args) {
		
		String[] folder = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
		System.out.println(removeSubfolders(folder));
		
		folder = new String[] {"/a","/a/b/c","/a/b/d"};
		System.out.println(removeSubfolders(folder));
		
		folder = new String[] {"/a/b/c","/a/b/ca","/a/b/d"};
		System.out.println(removeSubfolders(folder));

	}

}