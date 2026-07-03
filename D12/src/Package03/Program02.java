package Package03;

import java.util.Arrays;
import java.util.stream.Stream;

public class Program02 {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// display square of all even numbers
		Stream<Integer> s1 = Stream.of(arr); // To create the Stream Object
		Stream<Integer> s2 = s1.filter(e -> e % 2 == 0); // Operation 1
		Stream<Integer> s3 = s2.map(e -> e * e); // Operation 2
		s3.forEach(e -> System.out.println(e)); // Operation 3

		System.out.println(Arrays.toString(arr));
	}

}
