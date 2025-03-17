package SDETConcepts;

import java.util.HashSet;

class Student2 {
	int id;
	String name;

	Student2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() { 			// Generate hash code based on id and name
		return id * 31 + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) { // Equality based on id and name
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Student2 Student2 = (Student2) obj;
		return id == Student2.id && name.equals(Student2.name);
	}
}

public class SDETC_003_WithHashCodeAndEquals {

	public static void main(String[] args) {
		HashSet<Student2> set = new HashSet<>();

		Student2 s1 = new Student2(1, "John");
		Student2 s2 = new Student2(1, "John");

		set.add(s1);
		set.add(s2);

		System.out.println("Size of set: " + set.size()); // Output: 1
	}
}