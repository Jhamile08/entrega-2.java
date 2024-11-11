package Ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book was created succesfully");
    }

    public void lendBook(String bookToLend) {
        if (books.size() == 0) {
            System.out.println("Please add a book for lend");
        } else {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(bookToLend)) {
                    if (book.isAvailable()) {
                        book.setAvailable(false);
                        System.out.println("the book has been succesfully lent.");
                    } else
                        System.out.println("book is already lent");
                } else {
                    System.out.println("Book don't found");
                }
            }
        }

    }

    public void returnBook(String bookToReturn) {
        if (books.size() == 0) {
            System.out.println("Please add a book");
        } else {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(bookToReturn)) {
                    if (book.isAvailable()) {
                        System.out.println("book was never lent");
                    } else
                        book.setAvailable(true);
                    System.out.println("the book has been succesfully return.");
                }
            }
        }

    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println("Book's title: " + book.getTitle() + " available: " + book.isAvailable());
        }
    }
}
