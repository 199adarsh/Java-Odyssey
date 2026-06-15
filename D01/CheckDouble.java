/*
Algorithm:
1. Start.
2. Create Scanner object.
3. Check whether first input is a double using hasNextDouble().
   - If not, display error message and terminate.
4. Read first double value.
5. Check whether second input is a double using hasNextDouble().
   - If not, display error message and terminate.
6. Read second double value.
7. Calculate average = (num1 + num2) / 2.
8. Display the average.
9. Stop.
*/

import java.util.Scanner; 

public class CheckDouble { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        double num1 = 0;
        double num2 = 0;

        System.out.print("Enter first double value: "); 
        
        if (!sc.hasNextInt() && sc.hasNextDouble()) { 
            num1 = sc.nextDouble(); 
        } else { 
            System.out.println("Error: First input is not a double value."); 
            sc.close();
            return; 
        } 

        System.out.print("Enter second double value: "); 
        if (!sc.hasNextInt() && sc.hasNextDouble()) { 
            num2 = sc.nextDouble(); 
            double avg = (num1 + num2) / 2; 
            System.out.println("Average = " + avg); 
        } else { 
            System.out.println("Error: Second input is not a double value."); 
        } 

        sc.close(); 
    } 
}