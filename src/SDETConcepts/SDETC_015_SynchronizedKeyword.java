package SDETConcepts;

/*
 * The synchronized keyword is used to control access to a method or block 
 * by multiple threads, ensuring that only one thread can execute it at a time.
 */

class Counter {
	private int count = 0;

	// Synchronized method to increment the counter
	public synchronized void increment() {
		count++;
	}

	// Method to get the current count
	public int getCount() {
		return count;
	}
}

public class SDETC_015_SynchronizedKeyword {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		// Create two threads that increment the counter 1000 times each
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		});

		// Start both threads
		thread1.start();
		thread2.start();

		// Wait for both threads to finish
		thread1.join();
		thread2.join();

		// Print the final count
		System.out.println("Final Count: " + counter.getCount());
	}

}