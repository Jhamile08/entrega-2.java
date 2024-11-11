// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Schedule mySchedule = new Schedule();
// Scanner scanner = new Scanner(System.in);

// while (true) {
// System.out.println("\n--- Schedule Menu ---");
// System.out.println("1. Add Contact");
// System.out.println("2. Remove Contact");
// System.out.println("3. Search Contact by Name");
// System.out.println("4. Display All Contacts");
// System.out.println("5. Exit");
// System.out.print("Choose an option: ");

// int choice = scanner.nextInt();
// scanner.nextLine(); // Clear the buffer

// switch (choice) {
// case 1:
// System.out.print("Enter name: ");
// String name = scanner.nextLine();
// System.out.print("Enter phone number: ");
// int phoneNumber = scanner.nextInt();
// scanner.nextLine(); // Clear the buffer
// System.out.print("Enter email: ");
// String email = scanner.nextLine();

// mySchedule.addContact(new Contact(name, phoneNumber, email));
// break;

// case 2:
// System.out.print("Enter the name of the contact to remove: ");
// String nameToRemove = scanner.nextLine();

// mySchedule.removeContact(nameToRemove);
// break;

// case 3:
// System.out.print("Enter the name of the contact to search: ");
// String nameToSearch = scanner.nextLine();
// boolean found = false;

// for (Contact contact : mySchedule.getContacts()) {
// if (contact.getName().equalsIgnoreCase(nameToSearch)) {
// System.out.println("Contact found: " + contact);
// found = true;
// break;
// }
// }

// if (!found) {
// System.out.println("Contact " + nameToSearch + " not found.");
// }
// break;

// case 5:
// System.out.println("Exiting the schedule. Goodbye!");
// scanner.close();
// return;

// default:
// System.out.println("Invalid option. Please try again.");
// }
// }
// }
// }
