package SDETConcepts;

class Student3 {
    int id;
    String name;

    Student3(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SDETC_004_WithoutToString {

    public static void main(String[] args) {
        Student3 s1 = new Student3(1, "John");
        Student3 s2 = new Student3(2, "Doe");

        System.out.println(s1); // Output: Student3@5e91993f
        System.out.println(s2); // Output: Student3@1d251891
    }
}