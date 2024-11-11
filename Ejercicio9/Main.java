package Ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Library
        Library library = new Library();

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        int option;

        // Simple menu for interacting with the library
        do {
            System.out.println("\nLibrary Management Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Lend a book");
            System.out.println("3. Return a book");
            System.out.println("4. Show all books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (option) {
                case 1:
                    // Add a new book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    Book newBook = new Book(title, author, true); // Assuming the book is available by default
                    library.books.add(newBook);
                    System.out.println("Book added: " + newBook.getTitle());
                    break;

                case 2:
                    // Lend a book
                    library.toString();
                    System.out.print("Enter book title to lend: ");
                    String bookToLend = scanner.nextLine();
                    library.lendBook(bookToLend);
                    break;

                case 3:
                    // Return a book
                    library.toString();
                    System.out.print("Enter book title to return: ");
                    String bookToReturn = scanner.nextLine();
                    library.returnBook(bookToReturn);
                    break;

                case 4:
                    // Show all books
                    library.showBooks();
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        } while (option != 5);

        // Close the scanner
        scanner.close();
    }
}
