package Package03;

import java.util.stream.Stream;

public class Program03 {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// display square of all even numbers
		Stream.of(arr).filter(e -> e % 2 == 0).map(e -> e * e).forEach(e -> System.out.println(e));
	}

}
