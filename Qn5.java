package workshop6;

public class Qn5 {

	public static void main(String[] args) {
		
	}

}
abstract class Vehicle{
	public abstract void Wheel();
	public abstract void Door();
}

abstract class Bus extends Vehicle{
	@Override
	
	public void Wheel() {
		//no implementation.
	}
	
	@Override
	public void Door() {
		System.out.println("This is a Door method.");
	}
}