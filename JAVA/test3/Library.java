package test3;

import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
   
    private Map<String, List<Book>> issuedBooks = new HashMap<>();

    
    public void addBook(Book book) {
        books.add(book);
    }

   
    public void displayBooks() {
        System.out.println("\n--- Library Inventory ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }

   
    public void issueBook(String memberId, String bookId) {
        for (Book b : books) {
            if (b.getBookId().equals(bookId) && b.isAvailable()) {
                b.setAvailable(false);

                
                issuedBooks.putIfAbsent(memberId, new ArrayList<>());
                issuedBooks.get(memberId).add(b);

                System.out.println("Book issued successfully to Member: " + memberId);
                return;
            }
        }
        System.out.println("Error: Book [" + bookId + "] not found or already issued.");
    }

   
    public void returnBook(String memberId, String bookId) {
        List<Book> memberList = issuedBooks.get(memberId);
        if (memberList != null) {
            
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

    
    public void search(String title) {
        System.out.println("Searching for title: " + title);
        books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .forEach(System.out::println);
    }

 
    public void search(String author, boolean isAuthorSearch) {
        if (isAuthorSearch) {
            System.out.println("Searching for author: " + author);
            books.stream()
                    .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                    .forEach(System.out::println);
        }
    }
}
