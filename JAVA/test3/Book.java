package test3;

// The class name must be uppercase 'Book' to match your other files
public class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Getters and Setters (Encapsulation)
    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    // Overriding toString for clean printing
    @Override
    public String toString() {
        return String.format("[%s] %s by %s - %s",
                bookId, title, author, isAvailable ? "Available" : "Issued");
    }
}