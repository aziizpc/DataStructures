package Striver_StackAndQueue;

public class STQ_1_ImplementationOfStackUsingArrays {
	
	static int[] arr = new int[5];
	static int top = -1;
	
	public static void push(int x) {
		arr[++top] = x;
	}
	
	public static void pop() {	// (We are NOT checking if the Stack is empty. It should be checked?)
		top--;
	}
	
	public static int top() {
		return arr[top];
	}
	
	public static int size() {
		return top + 1;
	}
	
	public static boolean isEmpty() {
		if (top == -1) return true;
		return false;
	}

	public static void main(String[] args) {
		
		push(1);
		push(2);
		push(3);
		System.out.println("Size: " + size());
		System.out.println(top());
		pop();
		System.out.println(top());
		pop();
		System.out.println(isEmpty());
		pop();
		System.out.println(isEmpty());

	}
}