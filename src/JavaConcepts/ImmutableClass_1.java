package JavaConcepts;

public final class ImmutableClass_1 {

	private final String name;
	private final int age;

	public ImmutableClass_1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		ImmutableClass_1 obj = new ImmutableClass_1("Azeez", 20);

		System.out.println(obj.name + " " + obj.age);

		// obj.age = 33; // --> Gives error

		// obj.name = "Lion"; // --> Gives error

		// Means, the values are not changeable :)

	}

}