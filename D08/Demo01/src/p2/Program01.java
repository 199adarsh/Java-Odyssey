package p2;

import java.util.Date;

// java 1.5 onwards
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

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.setData(10);
		// b1.setData("dkte"); //NOT OK : type safety
		Integer i1 = b1.getData();
		System.out.println(i1);

		Box<String> b2 = new Box<>();
		b2.setData("sunbeam");
		// b2.setData(11.22); // NOT OK
		String s1 = b2.getData();
		System.out.println(s1);

		Box<Date> b3 = new Box<>();
		b3.setData(new Date());
		Date d1 = b3.getData();
		System.out.println(d1);

		Box b4 = new Box();
		// Box<Object> b4 = new Box<>();

	}

}
