package JavaConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapKeysImmutable {

	public static void main(String[] args) {
		
		Map<Company, String> myMap = new HashMap<Company, String>();
		
		Company cmp = new Company("Oracle", 1234);
		
		myMap.put(cmp, "Hyderabad");	// Inserted to Map
		
		System.out.println(myMap.get(cmp));	// Returns
		
		cmp.name = "Microsoft";	// Changed the Name
		
		System.out.println(myMap.get("Oracle"));	// Null

	}

}

class Company {	// Mutable Class

	String name;
	int code;

	public Company(String name, int code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return code == other.code && Objects.equals(name, other.name);
	}	
		
}