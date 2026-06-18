package Package01;

import java.util.Scanner;

class Circle {
	int radius;
	static double PI = 3.14;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		System.out.println("Area of circle - " + (PI * radius * radius));
	}
}

class Student {
	int rollno;
	String name;
	double percent;
	static String dept = "AI_DS";

	public static void acceptAllStudents(Student[] arr) {

		System.out.println(dept);
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student();
			arr[i].rollno = sc.nextInt();
			arr[i].name = sc.next();
			arr[i].percent = sc.nextDouble();
		}
	}

	public static void displayAllStudents(Student[] arr) {

	}

}

public class Program01 {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(6);
		Circle c3 = new Circle(7);
		Circle c4 = new Circle(8);
		c1.calculateArea();
		c2.calculateArea();
		c3.calculateArea();
		c4.calculateArea();

		Student[] arr = new Student[5];

		Student.acceptAllStudents(arr);
		Student.displayAllStudents(arr);

	}

}
