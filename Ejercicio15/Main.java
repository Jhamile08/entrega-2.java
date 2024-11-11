package Ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fleet fleet = new Fleet();
        boolean running = true;

        while (running) {
            System.out.println("\nFleet Management System");
            System.out.println("1. Add a vehicle");
            System.out.println("2. Register maintenance");
            System.out.println("3. Show all vehicles");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1: // Add a vehicle
                    System.out.print("Enter vehicle brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter vehicle model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter vehicle mileage: ");
                    int mileage = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    Vehicle vehicle = new Vehicle(brand, model, mileage);
                    fleet.addCar(vehicle);
                    break;

                case 2: // Register maintenance
                    System.out.print("Enter mileage interval for maintenance: ");
                    int mileageInterval = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    fleet.registerMaintenance(mileageInterval);
                    break;

                case 3: // Show all vehicles
                    fleet.showAllVehicles();
                    break;

                case 4: // Exit
                    running = false;
                    System.out.println("Exiting the Fleet Management System.");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}