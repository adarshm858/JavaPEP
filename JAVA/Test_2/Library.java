package Test_2;

import java.util.*;

class Library {

    private Map<String, Book> bookMap = new HashMap<>();

    public void addBook(Book book) {
        bookMap.put(book.getBookId(), book);
    }

    public void issueBook(String id) throws LibraryException {
        Book book = bookMap.get(id);

        if (book == null) {
            throw new LibraryException("Error: Book ID " + id + " not found.");
        }
        if (!book.isAvailable()) {
            throw new LibraryException("Error: Book '" + book.getTitle() + "' is already issued.");
        }

        book.setAvailable(false);
        System.out.println("Success: Issued " + book.getTitle());
    }

    public void returnBook(String id) throws LibraryException {
        Book book = bookMap.get(id);

        if (book == null) {
            throw new LibraryException("Error: Cannot return. Book ID " + id + " does not belong to this library.");
        }
        if (book.isAvailable()) {
            throw new LibraryException("Error: Invalid Return. '" + book.getTitle() + "' was never issued.");
        }

        book.setAvailable(true);
        System.out.println("Success: Returned " + book.getTitle());
    }

    public void displayAvailableBooks() {
        System.out.println("\n--- Available Books ---");
        boolean found = false;
        for (Book b : bookMap.values()) {
            if (b.isAvailable()) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("No books currently available.");
    }
}
