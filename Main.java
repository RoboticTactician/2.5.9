public class Main {
    public static void main(String[] args) {
        // Step 1: Print the initial owner's library
        System.out.println(MediaLib.getOwner() + "'s Library");

        // Step 8: Change the owner and print the updated library owner
        MediaLib.changeOwner("William");
        System.out.println(MediaLib.getOwner() + "'s Library");

        // Create instances of MediaLib for books and movies
        MediaLib bookLibrary = new MediaLib();
        MediaLib movieLibrary = new MediaLib();

        // Step 16: Add a book to the book library
        Book book = new Book("Cats", "Author");
        bookLibrary.addBook(book);

        // Step 17: Print the number of entries in the book library
        System.out.println(bookLibrary.getNumEntries());

        // Step 19-20: Add more books to the book library
        bookLibrary.addBook(new Book("Dogs", "Author"));
        bookLibrary.addBook(new Book("Dogs", "Author"));

        // Step 22: Print the updated number of entries in the book library
        System.out.println(bookLibrary.getNumEntries());
    }
}
