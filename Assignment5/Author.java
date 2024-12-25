import java.util.ArrayList;

class Author {
    private String name;
    private ArrayList<Book> books;

    public Author() {
        this.name = "Unknown";
        this.books = new ArrayList<>();
    }

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchBook(String bookName) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                return book;
            }
        }
        return null; // Book not found
    }

    public void displayBooksData() {
        if (books.isEmpty()) {
            System.out.println("There are no books to be displayed");
        } else {
            System.out.println("Books by Author " + name + ":");
            for (Book book : books) {
                book.displayBookInfo();
                System.out.println("-----------------------");
            }
        }
    }
}
