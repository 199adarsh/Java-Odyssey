package Package04;

import java.util.Scanner;

public class Employee {
	int empID;
	double salary;

	public Employee (int empID, double salary) {
		this.empID = empID;
		this.salary = salary;
	}

	public Employee () {
	}

	public void acceptEmployee(Scanner sc){
		System.out.println ("Enter the Employee ID : ");
		empID = sc.nextInt();
		System.out.println ("Enter Employee Salary : ");
		salary = sc.nextInt ();
	}

	public void displayEmployee(){
		System.out.println ("Employee ID     : "+empID);
		System.out.println ("Employee Salary : "+salary);
	}
}
