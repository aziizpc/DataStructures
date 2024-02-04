package JavaConcepts;

import java.util.Objects;

public final class ImmutableClass_2 {

	private final int id;
	private final String name;
	private final Engine engine;

	public ImmutableClass_2(int id, String name, Engine engine) {
		this.id = id;
		this.name = name;
		// this.engine = engine;	// Commented
		Engine oneEngine = new Engine(engine.speed); // NOTE (Newly added + below)	// Create an object of the class by calling its Constructor. We are creating Deep Copy of the object.
		this.engine = oneEngine;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Engine getEngine() {
		return engine;
	}
	
	@Override
	public String toString() {
		return "ImmutableClass_2 [id=" + id + ", name=" + name + ", engine=" + engine + "]";
	}

	public static void main(String[] args) {

		Engine myEngine = new Engine(50);
		ImmutableClass_2 obj = new ImmutableClass_2(1, "Azeez", myEngine);

		System.out.println(obj.name == "Azeez");	// true
		System.out.println(obj.engine.speed);		// 50

		myEngine.speed = 70;			// NOTE
		System.out.println(obj.engine.speed);		// 50
		
		System.out.println(obj);
		
		// obj.id = 40;			// Error
		// obj.name = "Shah";	// Error

	}

}

class Engine {
	int speed;

	public Engine(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Engine [speed=" + speed + "]";
	}
	
}