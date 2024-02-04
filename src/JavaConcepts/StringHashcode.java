// HashMap with String keys are FASTER for get operations

package JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class StringHashcode {
	
	public static void main(String[] args) {
		
		Map<Testers, Integer> myMap1 = new HashMap<Testers, Integer>();
		Testers t1 = new Testers();
		myMap1.put(t1, 1);
		myMap1.get(t1);
		myMap1.get(t1);
		myMap1.get(t1);
		myMap1.get(t1);
		myMap1.get(t1);
		
		System.out.println("-------------------------------------------");
		
		Map<String, Integer> myMap2 = new HashMap<String, Integer>();
		myMap2.put("Azeez", 1);	// Here, hashCode() method would be called only once. So, works FASTER.
		myMap2.get("Azeez");	// Why once? --> The hasCode value would be cached.
		myMap2.get("Azeez");
		myMap2.get("Azeez");
		myMap2.get("Azeez");
		myMap2.get("Azeez");
		myMap2.get("Azeez");
		
		System.out.println("-------------------------------------------");		
		
	}
	
}


class Testers{	
	@Override						// OVERRIDDEN HASHCODE METHOD
	public int hashCode() {
		System.out.println("Hashcode method is called :)");
		return super.hashCode();
	}	
}