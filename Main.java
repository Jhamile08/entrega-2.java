import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean exitProgram = false;

        do {
            // Menú principal
            System.out.println("Welcome to deliverable #2");
            System.out.println("Which exercise do you want to try? (1-20): ");
            System.out.println("Enter 0 to exit the program.");
            option = scanner.nextInt();

            if (option == 0) {
                exitProgram = true;
                System.out.println("Exiting program...");
            } else {
                Ejecutable ejercicio = seleccionarEjercicio(option);
                if (ejercicio != null) {
                    boolean returnToMenu = false;
                    do {
                        System.out.println("\nYou are in Exercise " + option);
                        System.out.println("1. Run Exercise");
                        System.out.println("0. Return to Main Menu");
                        System.out.print("Select an option: ");
                        int subOption = scanner.nextInt();

                        if (subOption == 1) {
                            ejercicio.execute();
                        } else if (subOption == 0) {
                            returnToMenu = true;
                        } else {
                            System.out.println("Invalid input. Try again.");
                        }
                    } while (!returnToMenu);
                } else {
                    System.out.println("Invalid option. Please select a number between 1 and 20.");
                }
            }
        } while (!exitProgram);

        scanner.close();
    }

    public static Ejecutable seleccionarEjercicio(int option) {
        switch (option) {
            case 1:
                return new Ejercicio1();
            case 2:
                return new Ejercicio2();
            case 3:
                return new Ejercicio3();
            case 4:
                return new Ejercicio4();
            case 5:
                return new Ejercicio5();
            case 7:
                return new Ejercicio7();
            // case 8:
            // return new Ejercicio8();
            // case 9:
            // return new Ejercicio9();
            case 10:
                return new Ejercicio10();
            // case 11:
            // return new Ejercicio11();
            // case 12:
            // return new Ejercicio12();
            // case 13:
            // return new Ejercicio13();
            // case 14:
            // return new Ejercicio14();
            // case 15:
            // return new Ejercicio15();
            // case 16:
            // return new Ejercicio16();
            // case 17:
            // return new Ejercicio17();
            // case 18:
            // return new Ejercicio18();
            // case 19:
            // return new Ejercicio19();
            // case 20:
            // return new Ejercicio20();
            default:
                return null;
        }
    }
}
