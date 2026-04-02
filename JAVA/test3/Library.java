package test3;

import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    // HashMap: Key = MemberID, Value = List of Books issued to that member
    private Map<String, List<Book>> issuedBooks = new HashMap<>();

    // 1. Add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // 2. Display all books
    public void displayBooks() {
        System.out.println("\n--- Library Inventory ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    // 3. Issue a book
    public void issueBook(String memberId, String bookId) {
        for (Book b : books) {
            if (b.getBookId().equals(bookId) && b.isAvailable()) {
                b.setAvailable(false);

                // Ensure the member has a list in the map, then add the book
                issuedBooks.putIfAbsent(memberId, new ArrayList<>());
                issuedBooks.get(memberId).add(b);

                System.out.println("Book issued successfully to Member: " + memberId);
                return;
            }
        }
        System.out.println("Error: Book [" + bookId + "] not found or already issued.");
    }

    // 4. Return a book
    public void returnBook(String memberId, String bookId) {
        List<Book> memberList = issuedBooks.get(memberId);
        if (memberList != null) {
            // Using an Iterator to avoid ConcurrentModificationException while removing
            Iterator<Book> iterator = memberList.iterator();
            while (iterator.hasNext()) {
                Book b = iterator.next();
                if (b.getBookId().equals(bookId)) {
                    b.setAvailable(true);
                    iterator.remove();
                    System.out.println("Book returned successfully.");
                    return;
                }
            }
        }
        System.out.println("Error: No record found for this return.");
    }

    // 5. Search for a book (Polymorphism - Overloading)
    // Search by Title
    public void search(String title) {
        System.out.println("Searching for title: " + title);
        books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .forEach(System.out::println);
    }

    // Search by Author (Overloaded method)
    public void search(String author, boolean isAuthorSearch) {
        if (isAuthorSearch) {
            System.out.println("Searching for author: " + author);
            books.stream()
                    .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                    .forEach(System.out::println);
        }
    }
}