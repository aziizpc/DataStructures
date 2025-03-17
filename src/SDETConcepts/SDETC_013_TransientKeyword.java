package SDETConcepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * The transient keyword is used in serialization to indicate that a field 
 * should not be serialized. It will not be saved when the object is converted to a 
 * byte stream.
 */

class Employee implements Serializable {
	// Serializable fields
	private static final long serialVersionUID = 1L; // Recommended for Serializable classes
	String name;
	int age;

	// Non-serializable field
	transient String password; // Marked transient to skip serialization

	// Constructor
	Employee(String name, int age, String password) {
		this.name = name;
		this.age = age;
		this.password = password;
	}

	// Display details
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Password: " + password); // Will be null after deserialization
	}
}

public class SDETC_013_TransientKeyword {

	public static void main(String[] args) {
		// Create an employee object
		Employee emp = new Employee("John", 30, "secure123");

		// Serialize the object
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
			oos.writeObject(emp);
			System.out.println("Object Serialized!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialize the object
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
			Employee deserializedEmp = (Employee) ois.readObject();
			System.out.println("\nObject Deserialized!");
			deserializedEmp.display(); // Password will be null
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}