package Misc;

public class Cons_CopyValuesUsingConstructor {

	int id;
	String name;

	// constructor to initialize integer and string
	Cons_CopyValuesUsingConstructor(int i, String n) {
		id = i;
		name = n;
	}

	// constructor to initialize another object
	Cons_CopyValuesUsingConstructor(Cons_CopyValuesUsingConstructor c) {
		id = c.id;
		name = c.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		Cons_CopyValuesUsingConstructor c1 = new Cons_CopyValuesUsingConstructor(100, "Joy");
		Cons_CopyValuesUsingConstructor c2 = new Cons_CopyValuesUsingConstructor(c1);
		c1.display();
		c2.display();
	}
}