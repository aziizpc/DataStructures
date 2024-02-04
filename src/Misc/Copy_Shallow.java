package Misc;

import java.util.Objects;

public class Copy_Shallow {

    public static void main(String[] args) {

        // Create an original object
        Foo original = new Foo("Hello", 10);

        // Check if the original object implements Cloneable
        if (original instanceof Cloneable) {

            // Clone the original object
            Foo clone = null;
			try {
				clone = (Foo) original.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            // Check if the clone is equal to the original
            System.out.println(Objects.equals(original, clone)); // true

            // Change the value of a field in the original object
            original.name = "World";

            // Check if the clone has also changed
            System.out.println(clone.name); // World
        }
    }
}

class Foo implements Cloneable {

    String name;
    int age;

    public Foo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
