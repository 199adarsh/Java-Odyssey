package p1;

import java.util.stream.Stream;

public class Program04 {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// display square of all even numbers
		Stream.of(arr).filter(e -> {
			System.out.println("Inside Filter - " + e);
			return e % 2 == 0;
		}).map(e -> {
			System.out.println("Inside Map - " + e);
			return e * e;
		}).forEach(System.out::println); // Method Reference
	}

}
