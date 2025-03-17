package SDETConcepts;

class Student6 implements Comparable<Student6> {
	int id;
	String name;

	Student6(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Implementing compareTo()
	@Override
	public int compareTo(Student6 other) {
		// Compare by ID
		return Integer.compare(this.id, other.id);
		//return this.name.compareTo(other.name);
	}
}

public class SDETC_007_WithCompareTo {

	public static void main(String[] args) {
		Student6 s1 = new Student6(1, "John");
		Student6 s2 = new Student6(2, "Doe");

		// Using compareTo
		System.out.println(s1.compareTo(s2)); // Output: -1
		System.out.println(s2.compareTo(s1)); // Output: 1
		System.out.println(s1.compareTo(s1)); // Output: 0
	}
}