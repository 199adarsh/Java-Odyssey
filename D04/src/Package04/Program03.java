package Package04;

import java.util.Scanner;

public class Program03 {
	static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		e1.acceptEmployee(sc);
		e1.displayEmployee();

		Manager m1 = new Manager();
		m1.acceptEmployee(sc);
		m1.displayManager();

	}
}
