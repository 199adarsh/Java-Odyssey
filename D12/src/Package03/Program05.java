package p1;

import java.util.stream.Stream;

public class Program05 {

	public static void main(String[] args) {
		String[] arr = { "Anil", "Mukesh", "Ramesh", "Suresh", "Ram", "Sham", "Anil", "Mukesh", "Ramesh", "Suresh",
				"Ram", "Sham" };

		Stream<String> s1 = Stream.of(arr);

		// count of all the elements
		// System.out.println("no of elements - " + s1.count());

		// display count of distinct names
		// long uniqueNameCount = s1.distinct().count();
		// System.out.println("Distinct elements count - " + uniqueNameCount);

		// display distinct names
		s1.distinct().forEach(System.out::println);
	}

}
