package Misc.AbstractionConcept;

public class AbstractClassConstructor_1 extends AbstractClassConstructor {
	
	int x;
	int y;
	
	
	public AbstractClassConstructor_1(int x, int y) {
		super(10, 20);	// To abstract class
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		
		AbstractClassConstructor_1 obj = new AbstractClassConstructor_1(30, 40);
		
		System.out.println(obj.i + " " + obj.j + " " + obj.x + " " + obj.y);
		
	}
}