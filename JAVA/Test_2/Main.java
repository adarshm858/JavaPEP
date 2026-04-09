package Test_2;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();


        myLibrary.addBook(new Book("B001", "Effective Java", "Joshua Bloch"));
        myLibrary.addBook(new Book("B002", "Clean Code", "Robert Martin"));
        myLibrary.addBook(new Book("B003", "Design Patterns", "Gang of Four"));
        myLibrary.addBook(new Book("B004", "Java Concurrency", "Brian Goetz"));
        myLibrary.addBook(new Book("B005", "Head First Java", "Kathy Sierra"));


        try {
            System.out.println("Initial Library State:");
            myLibrary.displayAvailableBooks();

            System.out.println("\nTesting Actions:");
            myLibrary.issueBook("B002");
            myLibrary.issueBook("B002");

        } catch (LibraryException e) {
            System.err.println(e.getMessage());
        }

        try {
            myLibrary.returnBook("B002");
            myLibrary.returnBook("B999");
        } catch (LibraryException e) {
            System.err.println(e.getMessage());
        }

        myLibrary.displayAvailableBooks();
    }
}