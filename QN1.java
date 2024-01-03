package workshop6;

public class QN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//QN1
abstract class Shape{
	abstract void calculateArea();
	abstract void calculatePerimeter();
}
//Qn2 &3
abstract class Quadrilateral extends Shape{
	void calculateArea() {
		System.out.println("Area: l*b ");
	}
	
	void calculatePerimeter() {
		System.out.println("Perimeter: L+B");
	}
}