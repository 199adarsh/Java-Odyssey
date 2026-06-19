import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] prices = {10, 50, 15, 20, 60, 90, 45, 75, 120};
        
        int choice = 0;
        int totalBill = 0;
        
        while (true) {
            
            System.out.println("\n--- Food Menu ---");
            System.out.println("1. Idli          - Rs 10");
            System.out.println("2. Dosa          - Rs 50");
            System.out.println("3. Wada          - Rs 15");
            System.out.println("4. Soft Drink    - Rs 20");
            System.out.println("5. Paratha       - Rs 60");
            System.out.println("6. Pav Bhaji     - Rs 90");
            System.out.println("7. Coke          - Rs 45");
            System.out.println("8. Chilli Potato - Rs 75");
            System.out.println("9. Red Bull      - Rs 120");
            System.out.println("10. Generate Bill");
            System.out.print("Enter choice: ");
            
            choice = sc.nextInt();
            
            
            if (choice == 10) {break;}
            
            
            if (choice >= 1 && choice <= 9) {
                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();
                totalBill += prices[choice - 1] * quantity;
				
            } else { System.out.println("Invalid choice! Please select a valid option.");}
			
			
        }
        
     
        System.out.println("\nTotal Bill: Rs " + totalBill);
    }
}