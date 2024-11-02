// LC - 316

package Striver_String;

public class STR_11_RemoveDuplicateLetters {
	
	public static String removeDuplicateLetters(String s) {

        StringBuilder sb = new StringBuilder();				// Answer StringBuilder
        int[] lastPos = new int[26];						// To store last index of each char
        boolean[] check = new boolean[26];					// To store if the char is considered at the moment

        for (int i = 0 ; i < s.length() ; i++){
            lastPos[s.charAt(i) - 'a'] = i;					// Store the last indices in the array
        }

        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);							
            
            if (check[c - 'a']) continue;					// If the check(c) true => char already considered

            // while loop:
                // when sb has some element in it &&
                // when last element in sb ('c') is greater than current element ('a') &&
                // when the position index of last element in sb is greater than i (Means the element is getting repeated LATER)
                    
            while ((sb.length() > 0) && (sb.charAt(sb.length() - 1 ) > c) && 
                    (lastPos[sb.charAt(sb.length() - 1) - 'a'] > i)){
                        check[sb.charAt(sb.length() - 1) - 'a'] = false;    // Set to FALSE
                        sb.deleteCharAt(sb.length() - 1);                  // Delete it from sb
                    }

            sb.append(c);									// Append the char

            check[c - 'a'] = true;							// Set to true

        }

        return sb.toString();
        
    }

	public static void main(String[] args) {
		
		String s = "cbacdcbc";
		System.out.println(removeDuplicateLetters(s));

	}

}
