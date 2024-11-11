import java.util.Scanner;

public class Ejercicio2 implements Ejecutable{
    private String title;
    private String author;
    private int numPages;

    public Ejercicio2 () {
    }

    public Ejercicio2(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        if (numPages >= 0) {
            this.numPages = numPages;
        } else {
            System.out.println("Number of pages can not be negative.");
            this.numPages = 0; 
        }
    }

    public void pagesQuantity(){
        if(getNumPages() > 300){
            System.out.println("The book have more than 300 pages");
        } else{
            System.out.println("The bool doesn't have more than 300 pages");
        }
    }

    public void printSummary() {
        System.out.println("Book Summary:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numPages);
    }



    @Override
  public void execute() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Book Menu ---");
            System.out.println("1. Add a new book");
            System.out.println("2. Check if the book has more than 300 pages");
            System.out.println("3. View book summary");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (option) {
                case 1:
                    System.out.print("Enter book title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    author = scanner.nextLine();
                    System.out.print("Enter number of pages: ");
                    int pages = scanner.nextInt();
                    setNumPages(pages); // Set pages with validation
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    pagesQuantity();
                    break;

                case 3:
                    printSummary();
                    break;

                case 0:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }

        scanner.close();
    }
    

    
}
