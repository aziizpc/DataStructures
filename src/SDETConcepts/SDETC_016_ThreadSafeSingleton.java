package SDETConcepts;

// Approach 1: Double-Checked Locking Pattern (Lazy Initialization):

class Singleton {
    // Volatile variable to ensure visibility across threads
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Method to provide global access
    public static Singleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (Singleton.class) { // Locking the class
                if (instance == null) { // Second check (with locking)
                    instance = new Singleton(); // Create instance
                }
            }
        }
        return instance;
    }
}

// Approach 2: Using Enum (Eager Initialization):

enum SingletonEnum {
    INSTANCE; // Single instance created

    // Method to perform actions
    public void showMessage() {
        System.out.println("Singleton using Enum!");
    }
}

public class SDETC_016_ThreadSafeSingleton {

}