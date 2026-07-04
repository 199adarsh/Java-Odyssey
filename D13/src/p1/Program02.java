package p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Program02 {
	private static void read() {
		try{
			FileInputStream fis = new FileInputStream("emp2.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			List<Employee> employees = (List<Employee>) ois.readObject();
			employees.forEach(System.out::println);

		} catch (Exception e) {	e.printStackTrace();}
	}

	private static void write(List<Employee> employees) {

		try {
			FileOutputStream fos = new FileOutputStream("emp2.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(employees);

		} catch (FileNotFoundException e) {e.printStackTrace();}
		  catch (IOException e1) {e1.printStackTrace();}

	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Anil", 10000));
		employees.add(new Employee(2, "Mukesh", 20000));
		employees.add(new Employee(3, "Ramesh", 30000));
		employees.add(new Employee(4, "Suresh", 40000));
		employees.add(new Employee(5, "Ram", 50000));
		write(employees);

		read();
	}
}