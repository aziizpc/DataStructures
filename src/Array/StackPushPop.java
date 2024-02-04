// LC 946

package Array;

import java.util.Stack;

public class StackPushPop {

	public static void main(String[] args) {
		int[] pushed = { 1, 2, 3, 4, 5 };
		int[] popped = { 4, 5, 3, 2, 1 };
		System.out.println(validateStackSequences(pushed, popped));

		pushed = new int[] { 1, 2, 3, 4, 5 };
		popped = new int[] { 4, 3, 5, 1, 2 };
		System.out.println(validateStackSequences(pushed, popped));
	}

	public static boolean validateStackSequences(int[] pushed, int[] popped) {

		if (pushed.length == 1)
			return true;

		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(pushed[0]);
		int i = 0;
		int j = 1;

		while (true) {
			if ((!myStack.isEmpty()) && myStack.peek() == popped[i] && i < popped.length) { // Check pop first
				myStack.pop();
				i++;
			} else if (j < pushed.length) {
				myStack.push(pushed[j]);
				j++;
			} else {
				break;
			}
		}

		return myStack.isEmpty();
	}

}