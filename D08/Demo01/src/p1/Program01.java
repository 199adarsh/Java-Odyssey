package p1;

import java.util.Date;

// till java 1.4
// write the generic code in java
class Box {
	private Object data;

	public void setData(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

}

public class Program01 {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setData(10);
		// b1.setData("dkte"); // No type safety
		Integer i1 = (Integer) b1.getData();
		System.out.println(i1);

		Box b2 = new Box();
		b2.setData("sunbeam");
		String s1 = (String) b2.getData();
		System.out.println(s1);

		Box b3 = new Box();
		b3.setData(new Date());
		Date d1 = (Date) b3.getData();
		System.out.println(d1);

	}

}
