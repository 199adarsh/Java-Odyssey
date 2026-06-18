import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Create Scanner object to accept input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        if (scanner.hasNextInt()) {

            int number = scanner.nextInt();
            
            System.out.println("Given Number :" + number);
            System.out.println("Binary equivalent :" + Integer.toBinaryString(number));
            System.out.println("Octal equivalent :" + Integer.toOctalString(number));
            System.out.println("Hexadecimal equivalent :" + Integer.toHexString(number));
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
        scanner.close();
	}
}