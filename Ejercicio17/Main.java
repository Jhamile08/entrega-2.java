package Ejercicio17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize products and orders
        Order orderSystem = new Order();

        // Sample products
        Product product1 = new Product("Laptop", "Electronics", 1000.0, 10);
        Product product2 = new Product("Phone", "Electronics", 500.0, 20);
        Product product3 = new Product("Headphones", "Accessories", 50.0, 30);
        orderSystem.addProductToInventory(product1);
        orderSystem.addProductToInventory(product2);
        orderSystem.addProductToInventory(product3);

        // Ask for client name
        System.out.print("Enter client's name: ");
        String clientName = scanner.nextLine();

        // Menu loop
        int choice;
        do {
            System.out.println("\n--- Order System ---");
            System.out.println("1. Show inventory");
            System.out.println("2. Create new order");
            System.out.println("3. Add product to order");
            System.out.println("4. Show order");
            System.out.println("5. Show all orders");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    orderSystem.showInvetory();
                    break;

                case 2:
                    orderSystem.createOrder();
                    break;

                case 3:
                    System.out.print("Enter order ID: ");
                    int orderId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    orderSystem.addProductToOrder(orderId, productName, quantity);
                    break;

                case 4:
                    System.out.print("Enter order ID to show: ");
                    orderId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    orderSystem.showOrder(orderId);
                    break;

                case 5:
                    orderSystem.showAllOrders();
                    break;

                case 6:
                    System.out.println("Goodbye " + clientName + "!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}
