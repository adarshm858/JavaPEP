package JAVA_TEST_3;

public class Books {
     private String isbn;
     private String title;
    private boolean isAvailable;

    public Books( String isbn, String title) {
        this.isAvailable = true;
        this.isbn = isbn;
        this.title = title;

    }
    public String getIsbn() {
        return isbn;
    }


    public String getTitle() {
        return title;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean available){
        isAvailable=available;
    }
}
