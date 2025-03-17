package SDETConcepts;

//Abstract Class: Common behavior for birds
abstract class Bird {
	public void eat() {
		System.out.println("Eating food...");
	}

	public void sleep() {
		System.out.println("Sleeping...");
	}

	// Abstract method for bird-specific flying behavior
	public abstract void fly();
}

//Sparrow Class
class Sparrow extends Bird {
	@Override
	public void fly() {
		System.out.println("Sparrow flies low and fast.");
	}
}

//Eagle Class
class Eagle extends Bird {
	@Override
	public void fly() {
		System.out.println("Eagle soars high in the sky.");
	}
}

//Usage
public class SDETC_025_AbstractClassRelated {
	
	public static void main(String[] args) {
		Bird sparrow = new Sparrow();
		sparrow.eat();
		sparrow.fly();
		sparrow.sleep();

		Bird eagle = new Eagle();
		eagle.eat();
		eagle.fly();
		eagle.sleep();
	}
	
}