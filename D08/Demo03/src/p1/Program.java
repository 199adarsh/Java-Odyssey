package p1;

class Student implements Comparable<Student> {
	int rollno;
	double marks;

	public Student() {
	}

	public Student(int rollno, double marks) {
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}

//	@Override
//	public int compareTo(Student o) {
//		if (this.rollno > o.rollno)
//			return 5;
//		else if (this.rollno < o.rollno)
//			return -2;
//		return 0;
//	}

	@Override
	public int compareTo(Student o) {
		if (this.marks > o.marks)
			return 7;
		else if (this.marks < o.marks)
			return -1;

		return 0;
	}

}

public class Program {

	public static void main(String[] args) {
		Student s1 = new Student(121, 75);
		Student s2 = new Student(132, 75);
		if (s1.compareTo(s2) > 0)
			System.out.println("s1 is greater");
		else if (s1.compareTo(s2) < 0)
			System.out.println("s2 is greater");
		else
			System.out.println("Both are equal");
	}

}
