package p3;

// bounded type paramater
// it can be used for classes
class Box<T extends Number> {
	private T data;

	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

}

public class Program01 {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();

		Box<Double> b2 = new Box<>();

		// Box<String> b3 = new Box<>();// NOT OK

		// Box<Date> b4 = new Box<>();// NOT OK
	}
}
