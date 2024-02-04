package Misc;

public class JavaObject_Important {

	String company;
	int wheel;
	boolean sunroof;

	public JavaObject_Important(String company, int wheel, boolean sunroof) {
		this.company = company;
		this.wheel = wheel;
		this.sunroof = sunroof;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {

		JavaObject_Important hw1 = new JavaObject_Important("tata", 5, true);
		JavaObject_Important hw2 = new JavaObject_Important("tata", 5, true);

		int a = hw1.hashCode();
		int b = hw2.hashCode();

		System.out.println(a + " " + b);

		System.out.println("------------------------------------------");

		if (hw1 == hw2) {
			System.out.println("true");
		} else
			System.out.println("false");

		if (hw1.equals(hw2)) {
			System.out.println("true");
		} else
			System.out.println("false");

		System.out.println("------------------------------------------");

		hw2 = hw1;		// NOTE

		if (hw1 == hw2) {
			System.out.println("true");
		} else
			System.out.println("false");

		if (hw1.equals(hw2)) {
			System.out.println("true");
		} else
			System.out.println("false");

		System.out.println("------------------------------------------");

		JavaObject_Important hw3 = null;

		try {
			hw3 = (JavaObject_Important) hw1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		if (hw3 == hw1) {
			System.out.println("true");
		} else
			System.out.println("false");

		if (hw3.equals(hw1)) {
			System.out.println("true");
		} else
			System.out.println("false");

	}
}