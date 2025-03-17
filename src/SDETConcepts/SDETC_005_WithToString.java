package SDETConcepts;

class Student4 {
	int id;
	String name;

	Student4(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student4{id=" + id + ", name='" + name + "'}";
	}
}

public class SDETC_005_WithToString {

	public static void main(String[] args) {
		Student4 s1 = new Student4(1, "John");
		Student4 s2 = new Student4(2, "Doe");

		System.out.println(s1); // Output: Student4{id=1, name='John'}
		System.out.println(s2); // Output: Student4{id=2, name='Doe'}
	}
}