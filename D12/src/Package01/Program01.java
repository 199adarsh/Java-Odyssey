package Package01;

//  java 8
// interfaces are mutable
interface Acceptable {
	void accept();

	default void display() {
		System.out.println("Acceptable::display");
	}
}

class Employee implements Acceptable {
	@Override
	public void accept() {
		System.out.println("Employe::accept");
	}

	@Override
	public void display() {
		System.out.println("Employee::display");
	}

}

class Date implements Acceptable {
	@Override
	public void accept() {
		System.out.println("Date::accept");
	}
}

class Product implements Acceptable {
	@Override
	public void accept() {
		System.out.println("Product::accept");
	}

	@Override
	public void display() {
		Acceptable.super.display();
		System.out.println("Product::display");
	}

}

public class Program01 {
	public static void main(String[] args) {
		Acceptable a1;
//		a1 = new Employee();
//		a1 = new Date();
		a1 = new Product();
		a1.accept();
		a1.display();
	}

}
