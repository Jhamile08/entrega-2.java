import java.util.Scanner;

public class Ejercicio4 implements Ejecutable{
    private String name;
    private int age;
    private String genre;
    public Ejercicio4() {
    }
    public Ejercicio4(String name, int age, String genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void comparateAge (Ejercicio4 persona1, Ejercicio4 persona2){
        if(persona1.getAge() > persona2.getAge()){
            System.out.println("The older are " + persona1.getName()+ " with: "+ persona1.getAge());
        }else  System.out.println("The older are " + persona1.getName()+ " with: "+ persona1.getAge());
    }
@Override
public void execute() {
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {
        System.out.println("\n--- Age Comparison Menu ---");
        System.out.println("1. Enter data for two people and compare ages");
        System.out.println("0. Exit to main menu");
        System.out.print("Select an option: ");
        
        int option = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        switch (option) {
            case 1:
                System.out.println("Enter data for the first person:");
                System.out.print("Name: ");
                String name1 = scanner.nextLine();
                System.out.print("Age: ");
                int age1 = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                System.out.print("Genre: ");
                String genre1 = scanner.nextLine();
                Ejercicio4 person1 = new Ejercicio4(name1, age1, genre1);

                System.out.println("Enter data for the second person:");
                System.out.print("Name: ");
                String name2 = scanner.nextLine();
                System.out.print("Age: ");
                int age2 = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                System.out.print("Genre: ");
                String genre2 = scanner.nextLine();
                Ejercicio4 person2 = new Ejercicio4(name2, age2, genre2);

                System.out.println("\nComparing ages...");
                comparateAge(person1, person2);
                break;

            case 0:
                exit = true;
                System.out.println("Returning to main menu...");
                break;

            default:
                System.out.println("Invalid option, please try again.");
        }
    }
    
    scanner.close();
}

}
