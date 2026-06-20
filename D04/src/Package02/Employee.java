package Package02;

import java.util.Scanner;

public class Employee {
	int empid;
	String name;
	double salary;

	Date doj;// Associatation (Composition)
	Date dot; // Asscoiatation (Aggegration)

	public Employee() {
		doj = new Date();
	}
	public void acceptEmployee(Scanner sc) {
		System.out.print("Enter empid - ");
		empid = sc.nextInt();

		System.out.print("Enter name - ");
		name = sc.next();

		System.out.print("Enter salary - ");
		salary = sc.nextDouble();

		System.out.println("Enter the date of joining : ");
		doj.acceptDate(sc);
	}

	public void terminateEmployee(Scanner sc) {
		System.out.println("Enter the termination date - ");
		dot = new Date();
		dot.acceptDate(sc);
	}

	public void displayEmployee() {
		System.out.println("Empid - " + empid);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);
		System.out.print("Date of joining : ");
		doj.displayDate();

		if (dot != null) {
			System.out.print("Date of termination : ");
			dot.displayDate();
		}
	}
}
