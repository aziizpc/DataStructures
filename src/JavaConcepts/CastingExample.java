package JavaConcepts;

class Parent {
    public void method1() {
        System.out.println("This is a method in the Parent class");
    }
}

class Child extends Parent {
    public void method2() {
        System.out.println("This is a method in the Child class");
    }
}

public class CastingExample {
    public static void main(String[] args) {
        // Create a Child object
        Child child = new Child();

        // Create a Parent reference that points to the Child object
        Parent parent = child;  // NOTE !!!!!!

        // Call the method1() method on the parent reference
        parent.method1();  // OK

        // Try to call the method2() method on the parent reference
        // This will throw a ClassCastException
        // parent.method2(); // ERROR - The method method2() is undefined for the type Parent

        // Cast the child object to a Parent object
        Parent castedChild = (Parent) child;  // NOTE !!!!!!
        
        castedChild.method1(); // OK

        // Call the method2() method on the castedChild reference
        // castedChild.method2();  // ERROR - The method method2() is undefined for the type Parent
    }
}
