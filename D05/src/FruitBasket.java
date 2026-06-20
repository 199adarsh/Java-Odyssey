import com.app.fruits.*;

import java.util.Scanner;

public class FruitBasket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter basket size: ");

		Fruit[] basket = new Fruit[sc.nextInt()];
		int counter = 0;
		boolean exit = false;

		while (!exit) {
			System.out.println ("No : Options ");
			System.out.println ("0  : Exit");
			System.out.println ("1  : Mango");
			System.out.println ("2  : Orange");
			System.out.println ("3  : Apple");
			System.out.println ("4  : Display Name of Fruits");
			System.out.println ("5  : Display Fresh Fruits");
			System.out.println ("6  : Mark Fruits as Stale");
			System.out.println ("7  : Display Stale Tastes");
			int choice = sc.nextInt();

			switch (choice) {
				case 0: exit = true; break;

				case 1: case 2: case 3:
					if (counter < basket.length) {
						System.out.print ("Enter Name   : ");
						String name = sc.next ();

						System.out.print ("Enter Colour : ");
						String colour = sc.next ();

						System.out.print ("Enter Weight : ");
						double weight = sc.nextDouble ();

						if ( choice == 1 ) basket[counter++] = new Mango (name, colour, weight);

						else if ( choice == 2 ) basket[counter++] = new Orange (name, colour, weight);

						else basket[counter++] = new Apple (name, colour, weight);

					} else System.out.println("Basket Full!");
					break;

				case 4:
					for ( Fruit f : basket )
						if ( f != null ) System.out.println (f.getName ());
					break;

				case 5:
					for ( Fruit f : basket )
						if ( f != null && f.isFresh () )
							System.out.println (f.toString () + "\nTaste: " + f.taste ());
					break;

				case 6:
					System.out.print ("Enter index: ");
					int index = sc.nextInt ();
					if ( index >= 0 && index < counter )
						basket[index].setFresh (false);

					else
						System.out.println ("Invalid Index!");

					break;

				case 7:
					for ( Fruit f : basket )
						if ( f != null && !f.isFresh () )
							System.out.println (f.taste ());
					break;
			}
		}
		sc.close();
	}
}