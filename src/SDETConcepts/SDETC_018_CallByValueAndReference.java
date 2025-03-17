package SDETConcepts;

public class SDETC_018_CallByValueAndReference {

	static class Person {
		String name;

		Person(String name) {
			this.name = name;
		}
	}

	public static void main(String[] args) {

		// Call by Value with primitive data type
		int num = 10;
		System.out.println("Before modifyPrimitive: " + num);
		modifyPrimitive(num); // Passes a copy of num
		System.out.println("After modifyPrimitive: " + num); // num remains 10

		// Call by Reference with object
		Person person = new Person("John");
		System.out.println("Before modifyObject: " + person.name);
		modifyObject(person); // Passes reference to the Person object
		System.out.println("After modifyObject: " + person.name); // person.name is changed to "Jane"

		// Call by Reference - changing the reference
		Person newPerson = new Person("Alice");
		System.out.println("Before changeReference: " + newPerson.name);
		changeReference(newPerson); // Passes reference, but changes to reference won't affect the original
		System.out.println("After changeReference: " + newPerson.name); // newPerson.name remains "Alice"
	}

	// Method to modify primitive data type (call by value)
	public static void modifyPrimitive(int num) {
		num = num + 5; // Modifies the copy, not the original
	}

	// Method to modify an object (call by reference concept)
	public static void modifyObject(Person p) {
		p.name = "Jane"; // Modifies the object properties
	}

	// Method to change the reference of the object (call by reference concept)
	public static void changeReference(Person p) {
		p = new Person("Doe"); // Changes the reference locally, but not outside
	}

}