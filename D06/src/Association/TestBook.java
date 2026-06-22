package Association;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number Of Books : ");
		int size = sc.nextInt();
		Book[] books = new Book[size];

		int choice;

		do {
			System.out.println ("1. Add Books");
			System.out.println ("2. Find Book By ID");
			System.out.println ("3. Find Book By Publish Year");
			System.out.println ("4. Display All Books");
			System.out.println ("5. Exit");
			System.out.print ("Enter Choice : ");

			choice = sc.nextInt ();

			switch ( choice ) {

				case 1:

					for ( int i = 0; i < size; i++ ) {
						if(books[i] == null) {
						System.out.println ("\nEnter Details Of Book " + (i + 1));
						books[i] = new Book ();
						books[i].acceptDetails ();
						}else System.out.println("Details are filled");
					}
					break;

				case 2:

					System.out.print ("Enter Book ID To Search : ");
					int searchId = sc.nextInt ();
					boolean found = false;

					for ( Book b : books )
						if ( b != null && b.id == searchId ) {
							b.displayData ();
							found = true;
							break;
						}


					if ( !found ) System.out.println ("Book Not Found!");
					break;

				case 3:

					System.out.print ("Enter Publish Year : ");
					int year = sc.nextInt ();
					found = false;

					for ( Book b : books )
						if ( b != null && b.publishDate.getYear () == year ) {
							b.displayData ();
							found = true;
						}


					if ( !found ) System.out.println ("No Books Found For Year " + year);
					break;

				case 4:
					for ( Book b : books )
						if ( b != null ) b.displayData ();
					break;

				case 5:
					System.out.println ("Program Ended.");
					break;

				default:
					System.out.println ("Invalid Choice!");
			}

		} while ( choice != 5 );

		sc.close();
	}
}

