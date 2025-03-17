package SDETConcepts;

public class SDETC_024_IntegerCache {
	public static void main(String[] args) {
		// Integers within the cache range (-128 to 127)
		Integer num1 = 100; // Autoboxing
		Integer num2 = 100; // Autoboxing
		System.out.println("num1 == num2: " + (num1 == num2)); // True (same cached object)

		// Integers outside the cache range
		Integer num3 = 200; // Autoboxing
		Integer num4 = 200; // Autoboxing
		System.out.println("num3 == num4: " + (num3 == num4)); // False (different objects)

		// Explicitly using valueOf (same behavior as autoboxing)
		Integer num5 = Integer.valueOf(100);
		Integer num6 = Integer.valueOf(100);
		System.out.println("num5 == num6: " + (num5 == num6)); // True (cached object)

		Integer num7 = Integer.valueOf(200);
		Integer num8 = Integer.valueOf(200);
		System.out.println("num7 == num8: " + (num7 == num8)); // False (new object for each)

		// Comparing using equals()
		System.out.println("num3.equals(num4): " + num3.equals(num4)); // True (value comparison)
	}
}