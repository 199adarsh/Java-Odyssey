

import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x and y for Point 1:");
        Point2D p1 = new Point2D(sc.nextDouble(), sc.nextDouble());


        System.out.println("Enter x and y for Point 2:");
        Point2D p2 = new Point2D(sc.nextDouble(), sc.nextDouble());



        System.out.println("\nP1 Details: " + p1.getDetails());
        System.out.println("P2 Details: " + p2.getDetails());

        if (p1.isEqual(p2)) {
			
			System.out.println("\nPoints P1 & P2 are located at the same position.");
        
		} else {
			
            System.out.println("\nPoints P1 & P2 are at different positions.");
            System.out.printf("Distance between p1 and p2: " + p1.calculateDistance(p2));
        }

        sc.close();
    }
}
