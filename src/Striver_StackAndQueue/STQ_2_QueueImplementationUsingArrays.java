package Striver_StackAndQueue;

public class STQ_2_QueueImplementationUsingArrays {
	
	static int[] arr = new int[5];
	static int front = 0;
	static int rear = 0;
	static int count = 0;			// Used to compare with n
	static int n = arr.length;
	
	// Note: Always use % with front and rear
	
	public static void push(int x) {
		if (count == n) {
			return;
		}
		arr[rear % n] = x;			// Note rear % n (Circular manner)
		count++;
		rear++;
	}
	
	public static void pop() {
		if (count == 0) return;
		arr[front % n] = -1; 		// Can be a dummy number (Different Note: %)
		count--;
		front++;
	}
	
	public static int top() {
		if (count == 0) return -1;	// -1 here ==> No element
		return arr[front % n];
	}

	public static void main(String[] args) {
		
		push(1);
		push(2);
		push(3);
		push(4);
		System.out.println(top());
		pop();
		System.out.println(top());
		push(5);
		System.out.println(top());

	}

}
