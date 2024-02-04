package JavaConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentModificationException {

	public static void main(String[] args) {

		Map<String, Integer> myMap = new HashMap<>();

		myMap.put("Azeez", 1);
		myMap.put("Same", 34);
		myMap.put("Phil", 56);
		myMap.put("June", 5);
		myMap.put("Harun", 0);
		myMap.put("Ram", 11);

		Iterator<String> myIt1 = myMap.keySet().iterator(); // Example 1

		Iterator<Integer> myIt2 = myMap.values().iterator(); // Example 2

		while (myIt1.hasNext()) {

			System.out.println(myIt1.next());

			myMap.put("Karen", 23); // NOTE

		}

		while (myIt2.hasNext()) {

			System.out.println(myIt2.next());

			myMap.put("Karen", 23); // NOTE

		}
	}
}