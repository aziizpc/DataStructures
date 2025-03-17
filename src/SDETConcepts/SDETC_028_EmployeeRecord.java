package SDETConcepts;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

class Employee28 {

	int id;
	String name;
	String department;

	Employee28(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee details: " + id + ", " + name + ", " + department;
	}

}

public class SDETC_028_EmployeeRecord {

	public static void main(String[] args) {

		List<Employee28> emp = Arrays.asList(new Employee28(1, "Azeez", "IT"), new Employee28(2, "Sam", "MFG"),
				new Employee28(3, "Tim", "IT"), new Employee28(4, "Ravi", "SEC"), new Employee28(5, "Shyam", "IT"));

		// Creating a Map and inserting the department name as key and value as list
		// of employees in that department.

//		Map<String, List<Employee28>> hm = new HashMap<String, List<Employee28>>();
//		
//		for (int i = 0 ; i < emp.size() ; i++) {
//			String dep = emp.get(i).department;
//			hm.putIfAbsent(dep, new ArrayList<Employee28>());
//			if (emp.get(i).department.equals(dep)) {
//				hm.get(dep).add(emp.get(i));
//			}
//		}

		// The commented out lines can be replaced with the following statement

		Map<String, List<Employee28>> hm = emp.stream().collect(Collectors.groupingBy(e -> e.department));

		System.out.println(hm);

		PriorityQueue<String> pq = new PriorityQueue<String>((a, b) -> {
			return a.compareTo(b);
		});

		pq.addAll(hm.keySet());

		Map<String, List<Employee28>> lhm = new LinkedHashMap<String, List<Employee28>>();

		while (!pq.isEmpty()) {
			lhm.put(pq.peek(), hm.get(pq.poll()));
		}

		System.out.println(lhm);

	}

}