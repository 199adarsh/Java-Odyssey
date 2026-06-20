package CarPooling;

import java.util.Scanner;

public class TestCar {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		CarPooling c = new CarPooling ();

		System.out.println ("Enter Miles Driven : ");
		c.setMilesDriven (sc.nextDouble ());

		System.out.println ("Enter the Gallon Cost : ");
		c.setGallonCost (sc.nextDouble ());

		System.out.println ("Enter the Average Mileage :");
		c.setAverageMileage (sc.nextDouble ());

		System.out.println ("Enter the Parking Fees:");
		c.setParkingFees (sc.nextDouble ());

		System.out.println ("Enter the Toll Amount : ");
		c.setTolls (sc.nextDouble ());

		c.vehicleCost ();
		c.calculateTotalCost ();

	}



}
