import java.util.Scanner;

public class Ejercicio10 implements Ejecutable {
    private String name;
    private Double salaryBase;
    private Double experienceYears;

    public Ejercicio10() {
    }

    public Ejercicio10(String name, Double salaryBase, Double experienceYears) {
        this.name = name;
        this.salaryBase = salaryBase;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public Double getSalaryBase() {
        return salaryBase;
    }

    public Double getExperienceYears() {
        return experienceYears;
    }

    public void calculateBonus() {

        Double bonus = salaryBase + (5 + experienceYears);
        System.out.println("Your bonus is: " + bonus);

    }

    @Override
    public String toString() {
        return "Ejercicio10 [name=" + name + ", salaryBase=" + salaryBase + ", experienceYears=" + experienceYears
                + "]";
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            // Displaying the menu
            System.out.println("Menu:");
            System.out.println("1. Enter Employee Data");
            System.out.println("2. Calculate Bonus");
            System.out.println("3. View Employee Data");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Option 1: Enter Employee Data
                    System.out.print("Enter Name: ");
                    this.name = scanner.nextLine();
                    System.out.print("Enter Base Salary: ");
                    this.salaryBase = scanner.nextDouble();
                    System.out.print("Enter Years of Experience: ");
                    this.experienceYears = scanner.nextDouble();
                    break;

                case 2:
                    // Option 2: Calculate Bonus
                    if (this.name != null && this.salaryBase != null && this.experienceYears != null) {
                        calculateBonus();
                    } else {
                        System.out.println("Please enter employee data first.");
                    }
                    break;

                case 3:
                    // Option 3: View Employee Data
                    if (this.name != null && this.salaryBase != null && this.experienceYears != null) {
                        System.out.println(toString());
                    } else {
                        System.out.println("No employee data available.");
                    }
                    break;

                case 4:
                    // Option 4: Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

}
