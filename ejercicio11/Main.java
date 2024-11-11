package ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = null;
        int option;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Car");
            System.out.println("2. Add Motorcycle");
            System.out.println("3. View Vehicle Description");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (option) {
                case 1:
                    System.out.print("Enter car brand: ");
                    String carBrand = scanner.nextLine();
                    System.out.print("Enter car model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Enter car maximum speed: ");
                    int carMaxSpeed = scanner.nextInt();
                    System.out.print("Enter number of doors: ");
                    scanner.nextLine(); // Clear the buffer
                    String numDoors = scanner.nextLine();
                    vehicle = new Car(carBrand, carModel, carMaxSpeed, numDoors);
                    System.out.println("Car added successfully.");
                    break;

                case 2:
                    System.out.print("Enter motorcycle brand: ");
                    String motoBrand = scanner.nextLine();
                    System.out.print("Enter motorcycle model: ");
                    String motoModel = scanner.nextLine();
                    System.out.print("Enter motorcycle maximum speed: ");
                    int motoMaxSpeed = scanner.nextInt();
                    System.out.print("Enter type of helmet: ");
                    scanner.nextLine(); // Clear the buffer
                    String typeHelmet = scanner.nextLine();
                    vehicle = new Motobike(motoBrand, motoModel, motoMaxSpeed, typeHelmet);
                    System.out.println("Motorcycle added successfully.");
                    break;

                case 3:
                    if (vehicle != null) {
                        System.out.println("Vehicle Description: " + vehicle.toString());
                    } else {
                        System.out.println("No vehicles registered.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);

        scanner.close();
    }
}
