package p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program01 {

	private static void read() {
		try{
			FileInputStream fis = new FileInputStream("p1/emp1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);
		} catch (Exception e) {e.printStackTrace();}
	}

	private static void write(Employee emp) {
		try {
			FileOutputStream fos = new FileOutputStream("p1/emp1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);

		}catch (FileNotFoundException e) {e.printStackTrace();}
		catch (IOException e1) {e1.printStackTrace();}
	}

	public static void main(String[] args) {

		Employee emp = new Employee(1, "Anil", 10000);
		write(emp);
		read();

	}

}
