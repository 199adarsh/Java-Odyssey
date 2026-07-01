package p1;

import java.util.ArrayList;
import java.util.List;

public class Program06 {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(5, "Mukesh", 20000));
        employees.add(new Employee(1, "Ramesh", 40000));
        employees.add(new Employee(4, "Anil", 30000));
        employees.add(new Employee(2, "Suresh", 50000));
        employees.add(new Employee(3, "Ram", 10000));

        System.out.println("unsorted employees -> ");
        employees.forEach(e -> System.out.println(e));
        System.out.println("---------------------------------");

        System.out.println("sorted employees on empid -> ");
        employees.sort((e1, e2) -> e1.empid - e2.empid);
        employees.forEach(e -> System.out.println(e));
        System.out.println("---------------------------------");

        System.out.println("sorted employees on name -> ");
        employees.sort((o1, o2) -> o1.name.compareTo(o2.name));
        employees.forEach(e -> System.out.println(e));
        System.out.println("---------------------------------");

        System.out.println("sorted employees on salary in desc -> ");
        employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        employees.forEach(e -> System.out.println(e));
        System.out.println("---------------------------------");

    }

}