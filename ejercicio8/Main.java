package ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear instancia del Stock
        Stock stock = new Stock();

        // Crear un scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int option;

        // Menú interactivo
        do {
            System.out.println("\nStock Management Menu:");
            System.out.println("1. Search by category");
            System.out.println("2. Display total price of inventory");
            System.out.println("3. show products");
            System.out.println("4. Create a new product");
            System.out.println("5. exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (option) {
                case 1:
                    // Buscar por categoría
                    System.out.print("Enter category to search: ");
                    String category = scanner.nextLine();
                    stock.searchByCategory(category);
                    break;

                case 2:
                    // Mostrar el total del inventario
                    stock.priceInventoryTotal();
                    break;

                case 3:
                    System.out.println(stock.toString());
                    break;

                case 4:
                    // Crear un nuevo producto
                    System.out.println("Creating a new product...");

                    // Pedir al usuario la información del producto
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.println(name);

                    System.out.print("Enter product category: ");
                    String categoryForNewProduct = scanner.nextLine();
                    System.out.println(categoryForNewProduct);

                    System.out.print("Enter product price: ");
                    Double price = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    System.out.println(price);

                    // Crear un nuevo producto con los datos ingresados
                    Product newProduct = new Product(name, categoryForNewProduct, price);
                    System.out.println("juan " + newProduct);

                    // Agregar el nuevo producto al stock
                    stock.addProduct(newProduct);

                    System.out.println("New product added: " + newProduct);
                    break;
                case 5:
                    // Salir
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        } while (option != 5);

        // Cerrar el scanner
        scanner.close();
    }
}
