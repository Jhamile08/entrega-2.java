import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Contact> contacts;

    public Schedule() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully");
    }

    public void removeContact(String name) {
        Contact contactToRemove = null;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contactToRemove = contact;
                break; // Exit the loop once the contact is found
            }
        }

        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Contact " + name + " has been removed.");
        } else {
            System.out.println("Contact " + name + " not found.");
        }
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        System.out.println("Contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
