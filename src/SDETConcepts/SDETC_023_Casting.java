package SDETConcepts;

//Superclass
class Animal23 {
	public void sound() {
		System.out.println("Animal23 makes a sound");
	}
}

//Subclass
class Dog extends Animal23 {
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}

	public void wagTail() {
		System.out.println("Dog is wagging its tail");
	}
}

public class SDETC_023_Casting {

	public static void main(String[] args) {
		// Upcasting: Subclass object assigned to superclass reference
		Animal23 animal = new Dog(); // Implicit upcasting
		animal.sound(); // Calls the overridden method in Dog (dynamic binding)

		// animal.wagTail(); // Compilation error: Animal23 reference doesn't have
		// wagTail()

		// Downcasting: Superclass reference back to subclass reference
		if (animal instanceof Dog) { // Always check instance type before downcasting
			Dog dog = (Dog) animal; // Explicit downcasting
			dog.sound(); // Calls Dog's overridden method
			dog.wagTail(); // Access subclass-specific method
		}

		// Unsafe Downcasting: Causes ClassCastException
		Animal23 anotherAnimal23 = new Animal23(); // Animal23 object
		try {
			Dog anotherDog = (Dog) anotherAnimal23; // Invalid downcasting
			anotherDog.sound(); // This will not be executed
		} catch (ClassCastException e) {
			System.out.println("ClassCastException: Cannot cast Animal23 to Dog");
		}
	}

}