// LC-856

package MyLC_String;

import java.util.Stack;

public class STR_6_ScoreOfParentheses {
	
	public static int scoreOfParentheses(String s) {

        Stack<Integer> st = new Stack<Integer>();

        int score = 0;

        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if (c == '(') {
                st.push(score);
                score = 0;
            }

            else if (c == ')'){
                score = st.pop() + Math.max(2 * score, 1);
            }

        }

        return score;
        
    }

	public static void main(String[] args) {
		String s = "(()(()))";
		
		System.out.println(scoreOfParentheses(s));

	}

}