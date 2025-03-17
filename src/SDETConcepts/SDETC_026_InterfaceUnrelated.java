package SDETConcepts;

//Interface: Common contract for flying objects
interface Flyable {
	void fly();
}

//Plane Class
class Plane implements Flyable {
	@Override
	public void fly() {
		System.out.println("Plane flies using engines and wings.");
	}
}

//Drone Class
class Drone implements Flyable {
	@Override
	public void fly() {
		System.out.println("Drone flies using propellers.");
	}
}

//Usage
public class SDETC_026_InterfaceUnrelated {
	
	public static void main(String[] args) {
		Flyable plane = new Plane();
		plane.fly();

		Flyable drone = new Drone();
		drone.fly();
	}
	
}