package ejercicio11;

public class Vehicle {
    private String brand;
    private String model;
    private int maxSpeed;
    private int currentSpeed;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {

        if (maxSpeed >= 300) {
            System.out.println("the speed cannot be greater than 300");
        }
        if (maxSpeed >= 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("The speed cannot be negative");
            this.maxSpeed = 0;
        }

    }

    public void accelerate(int increment) {
        if (increment < 0) {
            System.out.println("The increment cannot be negative.");
        } else if (currentSpeed + increment > maxSpeed) {
            currentSpeed = maxSpeed;
            System.out.println("Reached maximum speed: " + maxSpeed + " km/h");
        } else {
            currentSpeed += increment;
            System.out.println("Current speed: " + currentSpeed + " km/h");
        }
    }

    public void brake(int decrement) {
        if (decrement < 0) {
            System.out.println("The decrement cannot be negative.");
        } else if (currentSpeed - decrement < 0) {
            currentSpeed = 0;
            System.out.println("The vehicle has stopped.");
        } else {
            currentSpeed -= decrement;
            System.out.println("Current speed: " + currentSpeed + " km/h");
        }
    }

    @Override
    public String toString() {
        return "Ejercicio3 [brand=" + brand + ", model=" + model + ", maxSpeed=" + maxSpeed + ", currentSpeed="
                + currentSpeed + "]";
    }

    // @Override
    // public void execute() {
    // Scanner scanner = new Scanner(System.in);
    // boolean exit = false;

    // while (!exit) {
    // System.out.println("\n--- Vehicle Menu ---");
    // System.out.println("1. Enter vehicle data");
    // System.out.println("2. Accelerate");
    // System.out.println("3. Brake");
    // System.out.println("4. Show all vehicle data");
    // System.out.println("5. Show current speed");
    // System.out.println("0. Exit");
    // System.out.print("Select an option: ");

    // int option = scanner.nextInt();
    // scanner.nextLine(); // Clear buffer

    // switch (option) {
    // case 1:
    // System.out.print("Enter vehicle brand: ");
    // brand = scanner.nextLine();
    // System.out.print("Enter vehicle model: ");
    // model = scanner.nextLine();
    // System.out.print("Enter maximum speed: ");
    // maxSpeed = scanner.nextInt();
    // setMaxSpeed(maxSpeed); // Validate max speed
    // currentSpeed = 0; // Reset current speed when entering new data
    // System.out.println("Vehicle data entered successfully.");
    // break;

    // case 2:
    // System.out.print("Enter the speed increment: ");
    // int increment = scanner.nextInt();
    // accelerate(increment);
    // break;

    // case 3:
    // System.out.print("Enter the speed decrement: ");
    // int decrement = scanner.nextInt();
    // brake(decrement);
    // break;

    // case 4:
    // System.out.println(toString());
    // break;

    // case 5:
    // System.out.println("Current speed: " + currentSpeed + " km/h");
    // break;

    // case 0:
    // exit = true;
    // System.out.println("Exiting...");
    // break;

    // default:
    // System.out.println("Invalid option. Please try again.");
    // }
    // }

    // scanner.close();
    // }

}
