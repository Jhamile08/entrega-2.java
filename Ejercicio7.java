
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Ejercicio7 implements Ejecutable {
    private String name;
    ArrayList<Double> notesList;

    public Ejercicio7() {
    }

    public Ejercicio7(String name, ArrayList<Double> notesList) {
        this.name = name;
        this.notesList = notesList;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getNotesList() {
        return notesList;
    }

    public void addNotes(List<Double> newNotes) {
        notesList.addAll(newNotes);
        System.out.println("Notes added was: " + newNotes);
    }

    public void showNotes() {
        System.out.println("Notes of " + name + ": " + notesList);
    }

    public void notesAverage() {
        if (notesList == null) {
            System.out.println("you need have notes for have the average, plis add notes");

        } else {
            double sum = 0;
            for (Double note : notesList) {
                sum += note;
            }
            double average = sum / notesList.size();
            if (average >= 60) {
                System.out.println("Congratulations you pass!");
                System.out.println("The average of: " + name + ": " + average);
            } else
                System.out.println("saddlenly you fail with: " + average);
        }
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.print("Enter the student's name: ");
        this.name = scanner.nextLine();

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add notes");
            System.out.println("2. Show notes");
            System.out.println("3. Show average");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("How many notes do you want to add? ");
                    int noteCount = scanner.nextInt();
                    List<Double> newNotes = new ArrayList<>();
                    for (int i = 0; i < noteCount; i++) {
                        System.out.print("Enter note " + (i + 1) + ": ");
                        double note = scanner.nextDouble();
                        newNotes.add(note);
                    }
                    addNotes(newNotes);
                    break;

                case 2:
                    showNotes();
                    break;

                case 3:
                    notesAverage();
                    break;

                case 4:
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
