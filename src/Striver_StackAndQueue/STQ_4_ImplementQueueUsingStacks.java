package Striver_StackAndQueue;

import java.util.Stack;

public class STQ_4_ImplementQueueUsingStacks {			// We need two Stacks
	
	static Stack<Integer> input;						// Stack# 1				
	static Stack<Integer> output;						// Stack# 1
	
	public STQ_4_ImplementQueueUsingStacks() {
		input = new Stack<Integer>();
		output = new Stack<Integer>();
	}
	
	public static void push(int x) {					// Normal
		input.push(x);
	}
	
	public static int peek() {							// Note this:
		if (output.isEmpty()) {							// If the SECOND STACK is empty:
			while (! input.isEmpty()) {					// As long as the FIRST STACK is NOT EMPTY:
				output.push(input.pop());				// Pop and push it to the second stack
			}
		}
		return output.peek();							// Finally, return PEEK of the SECOND STACK
	}
	
	public static int pop() {							// Ideally it doesn't return anything, but here :)
		peek();											// Call peek() --> No need to capture what it returns
		return output.pop();							// POP the SECOND STACK
	}
	
	public static boolean empty() {
		return (input.isEmpty() && output.isEmpty());
	}	

	public static void main(String[] args) {
		
		new STQ_4_ImplementQueueUsingStacks();				// This is required
		push(1);
		push(2);
		push(3);
		System.out.println("Empty? : " + empty());
		System.out.println("Top Element: " + peek());
		pop();
		System.out.println("Top Element: " + peek());
		pop();
		System.out.println("Top Element: " + peek());
		pop();
		System.out.println("Empty? : " + empty());		

	}

}