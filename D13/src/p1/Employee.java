package p1;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	int empid;
	String name;
	double salary;
	String dept;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

}
