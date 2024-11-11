import java.util.Scanner;

public class Ejercicio1 implements Ejecutable {

    private String name;
    private double price;
    private int quantityStock;

    public Ejercicio1() {
    }


    public Ejercicio1(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        if (quantityStock >= 0) {
            this.quantityStock = quantityStock;
        } else {
            System.out.println("Error: Stock quantity cannot be negative.");
        }
    }

    public double totalValueInStock() {
        return price * quantityStock;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Product Menu ---");
            System.out.println("1. Enter new product");
            System.out.println("2. View total stock value");
            System.out.println("3. Increase stock");
            System.out.println("4. Decrease stock");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Enter product name: ");
                    name = scanner.nextLine();

                    double inputPrice;
                    do {
                        System.out.print("Enter product price: ");
                        inputPrice = scanner.nextDouble();
                        if (inputPrice < 0) {
                            System.out.println("Error: Price cannot be negative. Please enter a positive value.");
                        }
                    } while (inputPrice < 0);
                    setPrice(inputPrice);


                    int inputQuantity;
                    do {
                        System.out.print("Enter stock quantity: ");
                        inputQuantity = scanner.nextInt();
                        if (inputQuantity < 0) {
                            System.out.println("Error: Stock quantity cannot be negative. Please enter a positive value.");
                        }
                    } while (inputQuantity < 0);
                    setQuantityStock(inputQuantity);

                    System.out.println("Product entered successfully.");
                    break;

                case 2:
                    System.out.println("Total value in stock is: " + totalValueInStock());
                    break;

                case 3:
                    int increase;
                    do {
                        System.out.print("Enter the quantity to increase stock: ");
                        increase = scanner.nextInt();
                        if (increase < 0) {
                            System.out.println("Error: Quantity cannot be negative. Please enter a positive value.");
                        }
                    } while (increase < 0);
                    quantityStock += increase;
                    System.out.println("Stock updated. Current stock quantity: " + quantityStock);
                    break;

                case 4:
                    int decrease;
                    do {
                        System.out.print("Enter the quantity to decrease stock: ");
                        decrease = scanner.nextInt();
                        if (decrease < 0) {
                            System.out.println("Error: Quantity cannot be negative. Please enter a positive value.");
                        }
                    } while (decrease < 0);

                    if (decrease <= quantityStock) {
                        quantityStock -= decrease;
                        System.out.println("Stock updated. Current stock quantity: " + quantityStock);
                    } else {
                        System.out.println("Error: Cannot decrease more than available stock.");
                    }
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
