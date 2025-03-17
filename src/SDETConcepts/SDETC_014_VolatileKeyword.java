package SDETConcepts;

/*
 * The volatile keyword indicates that a variable's value will be modified by different 
 * threads. It ensures visibility of changes to variables across threads.
 */

class SharedResource {
	// Declare a volatile variable
	private volatile boolean flag = false;

	// Method to set the flag
	public void setFlagTrue() {
		System.out.println(Thread.currentThread().getName() + " is setting flag to true");
		flag = true; // Write operation
	}

	// Method to check the flag
	public void waitForFlag() {
		System.out.println(Thread.currentThread().getName() + " is waiting for flag to be true...");
		while (!flag) {
			// Busy-wait loop until flag becomes true
		}
		System.out.println(Thread.currentThread().getName() + " detected flag as true!");
	}
}

public class SDETC_014_VolatileKeyword {

	public static void main(String[] args) {
		SharedResource resource = new SharedResource();

		// Thread 1 - waits for flag to become true
		Thread thread1 = new Thread(() -> resource.waitForFlag(), "Thread-1");

		// Thread 2 - sets flag to true after 2 seconds
		Thread thread2 = new Thread(() -> {
			try {
				Thread.sleep(2000); // Simulate some delay
				resource.setFlagTrue();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "Thread-2");

		thread1.start(); // Start the waiting thread
		thread2.start(); // Start the flag-setting thread
	}

}