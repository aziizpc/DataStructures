package SDETConcepts;

import java.util.HashMap;

public class SDETC_027_StringAsHashMapKey {
	
	public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        
        String name = "aapc";
        
        map.put(name, "QA");

        map.put("John", "Developer");
        map.put("Alice", "Tester");
        map.put("Bob", "Manager");
        
        name = "Abdul Azeez";

        System.out.println("Role of aapc: " + map.get("aapc"));
        System.out.println("Role of Abdul Azeez: " + map.get(name));
    }

}