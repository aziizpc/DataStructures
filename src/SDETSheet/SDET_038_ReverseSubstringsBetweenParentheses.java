// LC - 1190

package SDETSheet;

import java.util.Stack;

public class SDET_038_ReverseSubstringsBetweenParentheses {
	
	public static String reverseParentheses(String s) {

        int  n = s.length();

        Stack<Integer> st = new Stack<Integer>();
        int[] pos = new int[n];

        for (int i = 0 ; i < n ; i++){
            char c = s.charAt(i);
            if (c == '(') st.push(i);
            else if (c == ')'){
                int k = st.pop();
                pos[k] = i;
                pos[i] = k;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0, d = 1 ; i < n ; i += d){
            char c = s.charAt(i);
            if (c == '(' || c == ')'){
                i = pos[i];
                d = -d;
            }
            else {
                sb.append(c);
            }
        }

        return sb.toString();
        
    }

	public static void main(String[] args) {
		
		String s = "(ed(et(oc))el)";
		
		System.out.println(reverseParentheses(s));

	}

}
