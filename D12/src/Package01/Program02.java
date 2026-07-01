package Package01;

interface Shape {
	void accept();

	void calculate();

	public static void addDummyShapes(Shape[] arr) {
		arr[0] = new Circle();
		arr[1] = new Rectangle();
		arr[2] = new Square();
		arr[3] = new Circle();
		arr[4] = new Rectangle();
	}

	public static void sortShapes(Shape[] arr) {

	}
}
//
//class Shapes {
//
//}

class Circle implements Shape {
	@Override
	public void accept() {
	}

	@Override
	public void calculate() {
	}
}

class Rectangle implements Shape {
	@Override
	public void accept() {
	}

	@Override
	public void calculate() {
	}
}

class Square implements Shape {
	@Override
	public void accept() {
	}

	@Override
	public void calculate() {
	}
}

public class Program02 {

	public static void main(String[] args) {
		Shape[] arr = new Shape[5];
		Shape.addDummyShapes(arr);
		Shape.sortShapes(arr);
	}

}
