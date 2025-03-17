package SDETConcepts;

import java.util.*;

class Student9 {
    int id;
    String name;

    Student9(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

// Custom comparator for sorting by ID
class SortById implements Comparator<Student9> {
    @Override
    public int compare(Student9 s1, Student9 s2) {
        return Integer.compare(s1.id, s2.id); 		// Ascending order
    }
}

// Custom comparator for sorting by Name
class SortByName implements Comparator<Student9> {
    @Override
    public int compare(Student9 s1, Student9 s2) {
        return s1.name.compareTo(s2.name); 			// Alphabetical order
    }
}

public class SDETC_009_WithCompare {

    public static void main(String[] args) {
        List<Student9> student = Arrays.asList(
            new Student9(3, "Alice"),
            new Student9(1, "John"),
            new Student9(2, "Bob")
        );

        // Sorting by ID
        Collections.sort(student, new SortById());
        System.out.println("Sorted by ID: " + student);

        // Sorting by Name
        Collections.sort(student, new SortByName());
        System.out.println("Sorted by Name: " + student);
        
        // Sorting by ID first, then by Name
        student.sort(new SortById().thenComparing(new SortByName()));	// Just NOTE
        System.out.println("Sorted by ID and then By Name: " + student);
        
    }
}