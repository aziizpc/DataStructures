// If you want to CHANGE value

package JavaConcepts;

public final class ImmutableClass_3 {

	private final int id;
	private final String name;
	private final NewEngine newEngine;

	public ImmutableClass_3(int id, String name, NewEngine newEngine) {
		this.id = id;
		this.name = name;
		this.newEngine = newEngine;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public NewEngine getNewEngine() {			// ANOTHER WAY
		return new NewEngine(newEngine.getSpeed());
	}

	@Override
	public String toString() {
		return "ImmutableClass_3 [id=" + id + ", name=" + name + ", newEngine=" + newEngine + "]";
	}

	public static void main(String[] args) {

		NewEngine myEngine = new NewEngine(50);
		ImmutableClass_3 obj = new ImmutableClass_3(1, "Azeez", myEngine);
		
		System.out.println(obj);

		System.out.println(obj.name == "Azeez");
		System.out.println(obj.newEngine.speed);

		myEngine.speed = 70; // NOTE
		System.out.println(obj.newEngine.speed); // 50
		
		System.out.println(obj); // ??

		// obj.id = 40; // Error
		// obj.name = "Shah"; // Error

	}

}

class NewEngine {
	int speed;

	public NewEngine(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "NewEngine [speed=" + speed + "]";
	}	
	
}