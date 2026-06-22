package Association;

import java.util.Scanner;

public class Book {

	Scanner sc = new Scanner(System.in);

	int id;
	String title;
	String author;
	Date publishDate = new Date();

	void acceptDetails() {

		System.out.print("Enter Book ID : ");
		id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Title : ");
		title = sc.nextLine();

		System.out.print("Enter Author : ");
		author = sc.nextLine();

		System.out.print("Enter Publish Date (DD MM YYYY) : ");

		publishDate.setDay(sc.nextInt());
		publishDate.setMonth(sc.nextInt());
		publishDate.setYear(sc.nextInt());
	}

	void displayData() {
		System.out.println("Book ID      : " + id);
		System.out.println("Book Title   : " + title);
		System.out.println("Book Author  : " + author);
		System.out.println("Publish Date : " + publishDate+"\n");
	}
}