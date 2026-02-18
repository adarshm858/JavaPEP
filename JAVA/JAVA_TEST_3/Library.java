//package JAVA_TEST_3;
//
//import java.awt.print.Book;
//import java.util.HashMap;
//
//public class Library {
//
//    private HashMap<String, Book> bookMap = new HashMap<>();
//    private int totalBooksCount = 0;
//
//
//    public void addBook(Book book) {
//        bookMap.put(book.getisbn(){
//        if (bookMap.isAvailable(),book) {
//            totalBooksCount++;
//        }}
//
//    public void borrowBook(String isbn) throws BookNotFoundException {
//        if (!bookMap.containsKey(isbn)) {
//            throw new BookNotFoundException("ISBN " + isbn + " not found in the system.");
//        }
//
//        Book book = bookMap.get(isbn);
//        if (!book.isAvailable()) {
//            throw new IllegalStateException("Book '" + book.getTitle() + "' is already borrowed.");
//        }
//        book.setAvailable(false);
//        totalBooksCount --;
//
//
//            System.out.println();
//    public int getTotalBooksCount() {
//        return totalBooksCount;
//    }
