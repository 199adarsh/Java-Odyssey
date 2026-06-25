package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;

    void acceptStudent(Scanner sc) {
        System.out.print("Enter Student ID : ");
        rollNo = sc.nextInt();

        System.out.print("Enter Student Name : ");
        name = sc.next();

        System.out.print("Enter Student Marks : ");
        marks = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Student [Roll No :" + rollNo +
                ", Name :" + name +
                ", Marks :" + marks + "]";
    }
}

class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.marks, s1.marks);
    }
}

class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollNo,s2.rollNo );
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students : ");
        int size = sc.nextInt();

        Student[] arr = new Student[size];

        boolean exit = false;

        while (!exit) {

            System.out.println("\n1. Add Student");
            System.out.println("2. Display Student by ID");
            System.out.println("3. Sort Students by Marks");
            System.out.println("4. Sort Students by Roll No");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == null) {
                            arr[i] = new Student();
                            arr[i].acceptStudent(sc);
                        }
                    }
                    if (arr[size - 1] != null) System.out.println("All entries are full");
                    break;

                case 2:
                    System.out.print("Enter Student ID : ");
                    int id = sc.nextInt();

                    boolean found = false;

                    for (Student s : arr) {
                        if (s != null && s.rollNo == id) {
                            System.out.println(s);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    Arrays.sort(arr, Comparator.nullsLast(new MarksComparator()));

                    System.out.println("Students sorted by marks:");
                    for (Student s : arr) {
                        if (s != null)
                            System.out.println(s);
                    }
                    break;
                case 4:
                    Arrays.sort(arr, Comparator.nullsLast(new RollNoComparator()));

                    System.out.println("Students sorted by marks:");
                    for (Student s : arr) {
                        if (s != null)
                            System.out.println(s);
                    }
                    break;

                case 5:
                    System.out.println("All Students:");
                    for (Student s : arr) {
                        if (s != null)
                            System.out.println(s);
                    }
                    break;

                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}