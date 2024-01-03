package workshop6;

public class QN7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish fish = new Fish();
		fish.eat();
		fish.speacialFeature();
		
		Bird bird = new Bird();
		bird.eat();
		bird.speacialFeature();
	}

}
interface Animall{
	void eat();
	void walk();
	
}
interface printable{
	void display();
}
interface LivingBeing{
	void speacialFeature();
}
class Fish implements Animall,LivingBeing{
	@Override
	public void eat() {
		System.out.println("Eat insects in water.");
	}
	
	@Override
	public void speacialFeature() {
		System.out.println("Breathe through the gills");
	}
}
class Bird implements Animall,LivingBeing{
	@Override
	public void eat() {
		System.out.println("Eat insects.");
	}
	@Override
	public void speacialFeature() {
		System.out.println("can fly");
	}
}