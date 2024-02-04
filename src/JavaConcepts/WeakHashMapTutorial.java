package JavaConcepts;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTutorial {

	public static void main(String[] args) {

		Map<Order, Integer> myMap = new WeakHashMap<>();
		
		myMap.put(new Order ("Azeez", 1), 23);
		myMap.put(new Order ("Elf", 34), 66);
		
		Order ord1 = new Order("Shah", 45);		// Creating a String Reference
		
		myMap.put(ord1, 66);		// Inserting the String Reference
		
		System.out.println(myMap.size());	// 3
		
		System.gc();			// Garbage Collection	(Weak References would be removed)
		
		System.out.println(myMap.size());	// 1

	}

}

class Order {

	String name;
	int id;

	public Order(String name, int id) {
		this.name = name;
		this.id = id;
	}

}