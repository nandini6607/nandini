public class Book {
    // Instance variables
    private String name;
    private String isbn;
    private String author;
    private String publisher;

    /**
     * Constructor to initialize the instance variables
     */
    public Book(String name, String isbn, String author, String publisher) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }

    // Set methods for each instance variable
    public void setName(String name) {
        this.name = name;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Get methods for each instance variable
    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    /**
     * Method to return the book's details as a String
     */
    public String getBookInfo() {
        return "Book Name: " + name + ", ISBN: " + isbn + ", Author: " + author + ", Publisher: " + publisher;
    }

    // Main method for testing purposes
    public static void main(String[] args) {
        // Create a new book object
        Book book = new Book("1984", "978-0451524935", "George Orwell", "Signet Classics");

        // Print book details
        System.out.println(book.getBookInfo());

        // Modify some details using set methods
        book.setPublisher("Penguin Books");
        book.setIsbn("978-0141036144");

        // Print updated book details
        System.out.println(book.getBookInfo());
    }
}
