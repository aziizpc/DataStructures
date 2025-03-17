package SDETConcepts;

class Student5 {
    int id;
    String name;

    Student5(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SDETC_006_WithoutCompareTo {

    public static void main(String[] args) {
        Student5 s1 = new Student5(1, "John");
        Student5 s2 = new Student5(2, "Doe");

        // Error: Cannot compare objects directly
        // System.out.println(s1.compareTo(s2)); 		// Compilation error!
        
        // Error - Cannot resolve method 'compareTo' in 'Student'

    }
}