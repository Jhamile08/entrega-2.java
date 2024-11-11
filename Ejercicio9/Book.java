package Ejercicio9;

public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book() {
    }

    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", available=" + available + "]";
    }

}
