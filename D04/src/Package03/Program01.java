package Package03;

import java.util.Scanner;
class Person{
	String name;
	String mobile;

	public void acceptPerson(Scanner sc){
		System.out.println ("Enter Name : ");
		name = sc.next ();
		System.out.println ("Enter Mobile : ");
		mobile = sc.next ();
	}

	public void displayPerson(){
		System.out.println ("Name of Person : "+ name);
		System.out.println ("Mobile no of Person : "+ mobile);

	}
}

class Employee extends Person{
	int empID;
	int salary;
	Scanner sc = new Scanner (System.in);

	public void acceptEmployee(Scanner sc){
		super.acceptPerson (this.sc);
		System.out.println ("Enter Employee ID : ");
		empID = this.sc.nextInt ();
		System.out.println ("Enter Employee Salary : ");
		salary = this.sc.nextInt ();
	}
	public void displayEmployee(){
		super.displayPerson ();
		System.out.println ("Employee ID : "+empID);
		System.out.println ("Employee Salary : "+salary);

	}

}
class Student extends Person{
	int rollNo;
	int marks;
	Scanner sc = new Scanner (System.in);

	public void acceptStudent(Scanner sc){
		super.acceptPerson (this.sc);
		System.out.println ("Enter Student ID : ");
		rollNo = this.sc.nextInt ();
		System.out.println ("Enter Student Marks : ");
		marks = this.sc.nextInt ();
	}
	public void displayStudent(){
		super.displayPerson ();
		System.out.println ("Student ID : "+rollNo);
		System.out.println ("Student Marks : "+marks);

	}

}

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		Employee e1 = new Employee();
		e1.acceptEmployee(sc);
		e1.displayEmployee();

		Student s1 = new Student();
		s1.acceptStudent (sc);
		s1.displayStudent ();

	}

}