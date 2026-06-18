package Package04;

import java.util.Scanner;

public class Manager extends Employee{
	double bonus;

	public Manager (int empID, double salary, double bonus) {
		super (empID, salary);
		this.bonus = bonus;
	}

	public Manager () {

	}

	public void acceptManager(Scanner sc){
		acceptEmployee (sc);
		System.out.println ("Manager Bonus   : ");
		bonus= sc.nextInt ();
	}

	public void displayManager(){
		displayEmployee ();
		System.out.println ("Manager Bonus   : "+bonus);
	}
}
