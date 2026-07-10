import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FoodDb db = new FoodDb();
        db.dbConnect();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nFood Order System");
            System.out.println("1. Add Food");
            System.out.println("2. Display All Food");
            System.out.println("3. Search Food By ID");
            System.out.println("4. Update Food");
            System.out.println("5. Delete Food");
            System.out.println("6. Filter By Category");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Food ID: ");
                    int addId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Food Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Food Category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter Food Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity Available: ");
                    int avail = scanner.nextInt();

                    db.addFood(addId, name, category, price, avail);
                    break;

                case 2:
                    db.displayFood();
                    break;

                case 3:
                    System.out.print("SEARCH (Food ID): ");
                    int searchId = scanner.nextInt();
                    db.searchFood(searchId);
                    break;

                case 4:
                    System.out.print("UPDATE (Food ID): ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Food Name: ");
                    String uName = scanner.nextLine();
                    System.out.print("Enter New Food Category: ");
                    String uCategory = scanner.nextLine();
                    System.out.print("Enter New Food Price: ");
                    double uPrice = scanner.nextDouble();
                    System.out.print("Enter New Quantity Available: ");
                    int uAvail = scanner.nextInt();

                    db.updateFood(updateId, uName, uCategory, uPrice, uAvail);
                    break;

                case 5:
                    System.out.print("DELETE (Food ID): ");
                    int deleteId = scanner.nextInt();
                    db.deleteFood(deleteId);
                    break;

                case 6:
                    scanner.nextLine();
                    System.out.print("FILTER (Enter Category): ");
                    String filterCat = scanner.nextLine();
                    db.sortByWithCategory(filterCat);
                    break;
                    
                case 7:
                    exit = true;
                    db.closeConnection();
                    System.out.println("Exited!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }
}