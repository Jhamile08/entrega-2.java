import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Inventary inventary = new Inventary(); // Using the default constructor
        boolean running = true;

        while (running) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add a product");
            System.out.println("2. Delete a product");
            System.out.println("3. Search product by name or category");
            System.out.println("4. Sell a product");
            System.out.println("5. Show all products");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1: // Add a product
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product stock quantity: ");
                    Double stock = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    Product product = new Product(name, category, price, stock);
                    inventary.addProduct(product);
                    System.out.println("Product added successfully.");
                    break;

                case 2: // Delete a product
                    System.out.print("Enter product name to delete: ");
                    String deleteName = scanner.nextLine();
                    inventary.deleteProduct(deleteName);
                    break;

                case 3: // Search product by name or category
                    System.out.print("Enter name or category to search: ");
                    String searchQuery = scanner.nextLine();
                    inventary.searchByNameOrCategory(searchQuery);
                    break;

                case 4: // Sell a product
                    System.out.print("Enter product name to buy: ");
                    String sellName = scanner.nextLine();
                    System.out.print("EHow many " + sellName + "do you want? ");
                    Double stockBuy = scanner.nextDouble();
                    inventary.sellProduct(sellName, stockBuy);
                    break;

                case 5: // Show all products
                    System.out.println("Inventory: ");
                    System.out.println(inventary);
                    break;

                case 6: // Exit
                    running = false;
                    System.out.println("Exiting Inventory Management System.");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}
