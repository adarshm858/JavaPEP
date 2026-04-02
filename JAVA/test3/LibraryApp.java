package test3;

public class LibraryApp {
    public static void main(String[] args) {
        // Initialize the library system
        Library myLibrary = new Library();

        // 1. Adding Books to the ArrayList
        myLibrary.addBook(new Book("B001", "Effective Java", "Joshua Bloch"));
        myLibrary.addBook(new Book("B002", "Clean Code", "Robert Martin"));
        // FIXED: Changed 'book' to 'Book'
        myLibrary.addBook(new Book("B003", "Java Design Patterns", "Erich Gamma"));

        // 2. Creating a Member (Demonstrating Inheritance)
        StudentMember student = new StudentMember("S101", "Alice");

        // 3. Display initial inventory
        myLibrary.displayBooks();

        // 4. Issue a book (Updates the HashMap and Book status)
        System.out.println("\n--- Action: Issuing B001 to S101 ---");
        myLibrary.issueBook(student.getMemberId(), "B001");

        // 5. Demonstrate Search (Polymorphism/Overloading)
        System.out.println("\n--- Action: Searching for 'Clean Code' ---");
        myLibrary.search("Clean Code");

        // 6. Display books after issuance
        myLibrary.displayBooks();

        // 7. Return a book
        System.out.println("\n--- Action: Returning B001 ---");
        myLibrary.returnBook("S101", "B001");

        // 8. Final Display
        myLibrary.displayBooks();
    }
}