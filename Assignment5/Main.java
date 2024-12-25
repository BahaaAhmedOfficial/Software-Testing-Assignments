public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("1984", 500, 45.99f);
        Book book2 = new Book("El principe de la niebla", 300, 35.50f);
        Book book3 = new Book("Lorem Ipsum", 400, 50.75f);

        Author author1 = new Author("George Orwell");
        Author author2 = new Author("Luis Carlos");

        author1.addBook(book1);
        author2.addBook(book2);
        author2.addBook(book3);

        String searchName = "1984";

        Book foundBook = author1.searchBook(searchName);

        if (foundBook != null) {
            System.out.println("Book Found:");
            foundBook.displayBookInfo();
        } else {
            System.out.println("Book with name '" + searchName + "' not found.");
        }

        System.out.println("\nDisplaying all books by the author:");

        author2.displayBooksData();
    }
}
