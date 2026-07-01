package p1;

import java.util.ArrayList;
import java.util.List;

public class Program04 {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(5, "Mukesh", 20000));
		employees.add(new Employee(1, "Ramesh", 40000));
		employees.add(new Employee(4, "Anil", 30000));
		employees.add(new Employee(2, "Suresh", 50000));
		employees.add(new Employee(3, "Ram", 10000));

		System.out.println("unsorted employees -> ");
		for (Employee e : employees)
			System.out.println(e);
		System.out.println("------------------------------");

		System.out.println("employees sorted on empid -> ");

		// Lambda expression : short hand implementation of Functional Interface
		// -> : Lambda operator
		employees.sort((Employee o1, Employee o2) -> {
			return o1.empid - o2.empid;
		});

		for (Employee e : employees)
			System.out.println(e);
		System.out.println("------------------------------");
	}

}
