package SDETConcepts;

import java.util.Arrays;
import java.util.List;

class Student8 {
    int id;
    String name;

    Student8(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SDETC_008_WithoutCompare {

    public static void main(String[] args) {
        List<Student8> student = Arrays.asList(
            new Student8(3, "Alice"),
            new Student8(1, "John"),
            new Student8(2, "Bob")
        );

        // Compilation error: Cannot sort without comparator
        // Collections.sort(student);
        // Error - 'Student' does not implement Comparable
    }
}