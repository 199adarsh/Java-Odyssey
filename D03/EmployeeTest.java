import java.util.*;
class Employee {
	
	String fristName;
	String lastName;
	double monthlySalary;
	
	public Employee(String fristName, String lastName, double monthlySalary){
		this.fristName = fristName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	

	
	String getfristName()	{ return fristName;}
	String getlastName()	{ return lastName;}
	double getmonthlySalary()	{ return monthlySalary;}
	
	void setlastName(String lastName){this.lastName = lastName;}
	void setfristName (String fristName) {this.fristName = fristName;}
	void setmonthlySalary (double monthlySalary) {this.monthlySalary = monthlySalary;}
	
	void getEmployeeSalary(){
		if( monthlySalary < 0) monthlySalary = 0.0;
		System.out.println("Details of Employee Salary : \nEmployee Name : " +fristName+" "+lastName+ "\nMonthly Salary : "+monthlySalary+
		"\nYearly salary  is (Without Bonus): "+monthlySalary*12+"\n Total Yearly Salary with Bonus: " +(monthlySalary *12)*1.10);
	}
}

public class EmployeeTest{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Employee i = new Employee("Alex","Green",15000);
		
		System.out.println("Using Getter Meathods : ");
		System.out.println("Frist Name : " + i.getfristName());
		System.out.println("Last Name : " + i.getlastName());
		System.out.println("Monthly Salary : " + i.getmonthlySalary());
		
		
		System.out.print("\nEnter Employee Frist name :");
		String fristName = sc.nextLine();
		
		System.out.print("Enter Employee Last name :");
		String lastName = sc.nextLine();
		
		System.out.print("Enter the Monthly Salary : ");
		double monthlySalary = sc.nextDouble();
				
		
		System.out.println("\nUsing Setter Meathods :");
		i.setlastName(lastName);
		i.setfristName(fristName);
		i.setmonthlySalary(monthlySalary);

		
		System.out.println("Frist Name : "+  i.getfristName());
		System.out.println("Last Name : "+ i.getlastName());
		
		System.out.println("Monthly Salary : "+ i.getmonthlySalary());
		
		System.out.println("");
		i.getEmployeeSalary();
		
		
	}
}