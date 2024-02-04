// hashCode() and equals() methods are already implemented in Wrapper classes.

package JavaConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsFunctions {

	public static void main(String[] args) {
		
		System.out.println("\n-------------------------------------------------------------------");

		Employee emp1 = new Employee(1, "Jack");
		Employee emp2 = new Employee(1, "Jack");

		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));

		Map<Employee, Integer> myMap1 = new HashMap<Employee, Integer>();

		myMap1.put(emp1, 1);
		myMap1.put(emp2, 1);

		System.out.print("myMap1 size: " + myMap1.size());
		
		System.out.println(myMap1);

		System.out.println("\n-------------------------------------------------------------------");

		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);

		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));

		Map<Integer, Integer> myMap2 = new HashMap<Integer, Integer>();

		myMap2.put(i1, 1);
		myMap2.put(i2, 1);

		System.out.print("myMap2 size: " + myMap2.size());
		
		System.out.println(myMap2);

		System.out.println("\n-------------------------------------------------------------------");

		Student stud1 = new Student(1, "Sam");
		Student stud2 = new Student(1, "Sam");

		System.out.println(stud1 == stud2);
		System.out.println(stud1.equals(stud2));

		Map<Student, Integer> myMap3 = new HashMap<Student, Integer>();

		myMap3.put(stud1, 1);
		myMap3.put(stud2, 1);

		System.out.print("myMap3 size: " + myMap3.size());
		
		System.out.println(myMap3);

		System.out.println("\n-------------------------------------------------------------------");

		Manager man1 = new Manager(1, "Ali");
		Manager man2 = new Manager(1, "Ali");

		System.out.println(man1 == man2);
		System.out.println(man1.equals(man2));

		System.out.println(man1.hashCode() == man2.hashCode());
		
		Map<Manager, Integer> myMap4 = new HashMap<Manager, Integer>();

		myMap4.put(man1, 1);
		myMap4.put(man2, 1);

		System.out.print("myMap4 size: " + myMap4.size());
		
		System.out.println(myMap4);
		
		System.out.println("\n-------------------------------------------------------------------");

	}

}

class Employee {

	int age;
	String name;

	public Employee(int age, String name) {
		this.age = age;
		this.name = name;
	}

}

class Student { // With hashCode() and equals() methods

	int age;
	String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		// return age == other.age && Objects.equals(name, other.name);
		return this.age == other.age && this.name.equals(other.name);
	}

}

class Manager { // With hashCode() and equals() methods

	int age;
	String name;

	public Manager(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return (int) Math.random() * 10000 + name.length() * 1000;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

}