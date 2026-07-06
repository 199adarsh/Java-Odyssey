package p1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Program03 {
	private static void read() {
		try {
			FileInputStream fis = new FileInputStream("emp3.db");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);

			List<Employee> employees = (List<Employee>) ois.readObject();
			employees.forEach(System.out::println);


		} catch (Exception e) {e.printStackTrace();}
	}

	private static void write(List<Employee> employees) {
		try {
			FileOutputStream fos = new FileOutputStream("emp3.db");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);

			oos.writeObject(employees);

		} catch (Exception e) {e.printStackTrace();}
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
