import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> b1 = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("01: Add Book \n02: Display All  \n03: Search Book by Id" );
            System.out.println("04: Delete Book \n05: Sort by title  \n06: Display books by category ");
            System.out.println("07: Show book stats  \n08: Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt(); sc.nextLine();
                        if (id <= 0) throw new Exception("ID must be > 0");

                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();
                        if(title == null) throw new CustomException("Title can not be empty");
                        System.out.print("Enter Author: ");

                        String author = sc.nextLine();
                        if(title == null) throw new CustomException("Author can not be empty");

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble(); sc.nextLine();
                        if (price <= 0) throw new Exception("Price must be > 0");

                        System.out.print("Enter Category (Novel/Thriller/Action): ");
                        String cat = sc.nextLine();
                        if (!(cat.equals("Novel") || cat.equals("Thriller") || cat.equals("Action")))
                            throw new Exception("Invalid Category");

                        b1.add(new Book(id, title, author, price, cat));
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    for (Book b : b1) System.out.println(b);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (Book b : b1) {
                        if (b.bookId == searchId) {
                            System.out.println(b);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Not found.");
                    break;

                case 4:
                    System.out.print("Enter Index to delete: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < b1.size()) b1.remove(idx);
                    else System.out.println("Invalid index.");
                    break;

                case 5:
                    b1.sort(Comparator.comparing(b -> b.title));
                    System.out.println("Sorted by title.");
                    break;

                case 6:
                    System.out.print("Enter category to filter: ");
                    String filter = sc.nextLine();
                    for (Book b : b1) if (b.category.equals(filter)) System.out.println(b);
                    break;

                case 7:
                    int n = 0;
                    for(Book b : b1)if(b.category.equals("Novel")) n++;
                    int t = 0;
                    for(Book b : b1)if(b.category.equals("Thriller") )t++;
                    int a = 0;
                    for(Book b : b1) if(b.category.equals("Action") )a++;
                    System.out.println("Total: " + b1.size() + "\nNovel: " + n + "\tThriller: " + t + " \tAction: " + a);
                    break;

                case 8:
                    exit = true;
                    break;
            }
        }
        sc.close();
    }
}