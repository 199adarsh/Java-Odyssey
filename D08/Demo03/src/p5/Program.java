package p5;

import java.util.Arrays;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	double marks;

	public Student() {
	}

	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "[rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollno - o.rollno;
	}

}

public class Program {
	public static void display(Student[] arr) {
		for (Student s : arr)
			System.out.println(s);
		System.out.println("---------------------------------------------");
	}

	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student(5, "Mukesh", 70);
		arr[1] = new Student(1, "Suresh", 60);
		arr[2] = new Student(4, "Anil", 50);
		arr[3] = new Student(2, "Ramesh", 75);
		arr[4] = new Student(3, "Ram", 80);
		System.out.println("List of unsorted students -> ");
		display(arr);

		System.out.println("List of students sorted on rollno -> ");
		Arrays.sort(arr);
		display(arr);

		System.out.println("List of students sorted on name -> ");
		Arrays.sort(arr);
		display(arr);

		System.out.println("List of students sorted on marks -> ");
		Arrays.sort(arr);
		display(arr);
	}

}
