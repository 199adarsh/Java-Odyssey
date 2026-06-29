package p6;

import java.util.Date;

class Box<T> {
	private T data;

	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

}

public class Program01 {

	// unbounded type parameter - wildcard(?)
	// can be used only for generic class references
	// lower bound
	public static void display(Box<? super Integer> b) {
		System.out.println("Data  : " + b.getData());
	}

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.setData(10);
		display(b1);

		Box<Double> b2 = new Box<>();
		b2.setData(11.22);
		// display(b2); // NOT OK

		Box<String> b3 = new Box<>();
		b3.setData("sunbeam");
		// display(b3); // NOT OK

		Box<Date> b4 = new Box<>();
		b4.setData(new Date());
		// display(b4); // NOT OK
	}
}
