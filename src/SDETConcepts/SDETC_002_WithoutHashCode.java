package SDETConcepts;

import java.util.HashSet;
import java.util.Set;

class Student1 {
	int id;
	String name;

	Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class SDETC_002_WithoutHashCode {

	public static void main(String[] args) {
		Set<Student1> set = new HashSet<Student1>();

		Student1 s1 = new Student1(1, "John");
		Student1 s2 = new Student1(1, "John");

		set.add(s1);
		set.add(s2);

		System.out.println("Size of set: " + set.size()); // Output: 2
	}
}