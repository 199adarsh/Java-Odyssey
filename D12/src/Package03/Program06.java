package Package03;

import java.util.stream.Stream;

public class Program06 {

	public static void main(String[] args) {
		String[] arr = { "Suresh", "Mukesh", "Ramesh", "Ram", "Anil", "Sham", "Anil", "Mukesh", "Ramesh" };

		// display distinct sorted names in asc order
		// Stream.of(arr).distinct().sorted().forEach(System.out::println);

		// display distinct sorted names in desc order
		Stream.of(arr).distinct().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);
	}

}
