// Comparable Interface ---> compareTo(AirLift o) function
// Comparator Interface ---> compare(AirLift o1, AirLift o2) function	| 	Individual functions for each

package JavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortObjectArrayOrList {

	public static void main(String[] args) {

		AirLift[] allAir = new AirLift[5];
		allAir[0] = new AirLift(45, "Sam");
		allAir[1] = new AirLift(22, "Jack");
		allAir[2] = new AirLift(9, "Ali");
		allAir[3] = new AirLift(3, "Phil");
		allAir[4] = new AirLift(27, "Navin");

		Arrays.sort(allAir);

		System.out.println(Arrays.toString(allAir));

		System.out.println("---------------------------------------------------------------");

		AirLift[] allAirNew = new AirLift[5];
		allAirNew[0] = new AirLift("Sam", 45, 2000);
		allAirNew[1] = new AirLift("Jack", 22, 12);
		allAirNew[2] = new AirLift("Ali", 9, 0);
		allAirNew[3] = new AirLift("Phil", 3, 6000);
		allAirNew[4] = new AirLift("Navin", 27, 2500);

		Arrays.sort(allAirNew);

		System.out.println(Arrays.toString(allAirNew));

		System.out.println("---------------------------------------------------------------");

		AirLift al1 = new AirLift(45, "Sam");
		AirLift al2 = new AirLift(22, "Jack");
		AirLift al3 = new AirLift(9, "Ali");
		AirLift al4 = new AirLift(99, "Ram");
		AirLift al5 = new AirLift(3, "Phil");
		AirLift al6 = new AirLift(27, "Navin");

		List<AirLift> myList = new ArrayList<AirLift>();
		myList.add(al1);
		myList.add(al2);
		myList.add(al3);
		myList.add(al4);
		myList.add(al5);
		myList.add(al6);

		Collections.sort(myList);

		System.out.println(myList);

		System.out.println("---------------------------------------------------------------");

		Collections.sort(myList, new AgeComparator()); // Sort by int

		System.out.println(myList);

		System.out.println("---------------------------------------------------------------");

		Collections.sort(myList, new NameComparator()); // Sort by String

		System.out.println(myList);

		System.out.println("---------------------------------------------------------------");

	}

}

class AirLift implements Comparable<AirLift> { // IMPLEMENTS INTERFACE -- CAN BE DONE IN A SIMILAR WAY WITH COMPARATOR

	String name;
	int age;
	int salary;

	public AirLift(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public AirLift(int age, String name) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AirLift [salary=" + salary + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(AirLift o) {
		return this.age - o.age; // SORT BY AGE
	}

}

class AgeComparator implements Comparator<AirLift> {

	@Override
	public int compare(AirLift o1, AirLift o2) {
		return o1.getAge() - o2.getAge();
	}

}

class NameComparator implements Comparator<AirLift> {

	@Override
	public int compare(AirLift o1, AirLift o2) {
		return o1.getName().compareTo(o2.getName());
	}

}