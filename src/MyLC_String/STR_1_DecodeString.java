// LC 394

package MyLC_String;

import java.util.Stack;

public class STR_1_DecodeString {
	
	public static String decodeString(String s) {

        Stack<Character> myStack = new Stack<Character>();

        char[] arr = s.toCharArray();

        for (int i = 0 ; i < arr.length ; i++){

            char c = arr[i];

            if (c != ']') myStack.push(c);

            else {
                StringBuilder sb = new StringBuilder();

                while ((!myStack.isEmpty()) && Character.isLetter(myStack.peek())){
                    sb.insert(0, myStack.pop());
                }
                String sub = sb.toString();
                myStack.pop(); // To pop '['

                sb = new StringBuilder();
                while ((!myStack.isEmpty()) && Character.isDigit(myStack.peek())){
                    sb.insert(0, myStack.pop());
                }
                int count = Integer.parseInt(sb.toString());

                String temp = "";
                while (count > 0){
                    temp += sub;
                    count--;
                }

                for (char ch : temp.toCharArray()){
                    myStack.push(ch);
                }

            }

        }

        StringBuilder sb = new StringBuilder();
        while (!myStack.isEmpty()){
            sb.insert(0, myStack.pop());
        }

        return sb.toString();

    }

	public static void main(String[] args) {
		
		String s = "3[a2[c]]";
		
		System.out.println(decodeString(s));

	}

}