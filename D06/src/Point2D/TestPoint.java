package Point2D;

import Point2D.com.app.geometry.Point2D;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the Number of Points : ");
		int count =sc.nextInt ();
		boolean exit = false;
		Point2D[] point = new Point2D[count];


	    while ( !exit ) {
		    System.out.println ("01 : Accept all details");
		    System.out.println ("02 : Display Specific Point");
		    System.out.println ("03 : Display All Points");
		    System.out.println ("04 : Validate Indices");
		    System.out.println ("00 : Exit");

		    int choice = sc.nextInt ();
		    switch ( choice ) {
			    case 1:
				    for ( int i = 0; i < count; i++ ) {
					    System.out.println ("Enter the x and y co-ordinates :+");
					    point[i] = new Point2D (sc.nextDouble (), sc.nextDouble ());
				    }break;

			    case 2:
				    System.out.print ("Enter the index :");
				    int index = sc.nextInt ();

				    if ( 0 < index && index < point.length )
						System.out.println (point[index].getDetails ());

				    else System.out.println ("Invalid Index");
					break;

			    case 3:
				    for ( Point2D p : point ) {
					    System.out.println (p.getDetails ());
				    }break;

			    case 4:
				    System.out.print ("Enter Frist Index :");
				    int p1 = sc.nextInt ();

				    System.out.print ("Enter Second Index :");
				    int p2 = sc.nextInt ();
				    if ( point[p1].isEqual (point[p2]) ) {
						System.out.println ("\nPoints P1 & P2 are located at the same position.");
				    } else {
					    System.out.println ("\nPoints P1 & P2 are at different positions.");
					    System.out.println ("Distance between p1 and p2: " + point[p1].calculateDistance (point[p2]));
				    }break;

			    case 0:
				    exit = true;
				    break;

		    }


		}
		sc.close();
    }
}
