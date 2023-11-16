public class MediaLib {
    private Book book;
    private static String owner = "PLTW";
    private static int numEntries = 0;

    // Step 14
    public void addBook(Book newBook) {
        if (book != null) {
            System.out.println("Already a book in here"); // Step 24
            return;
        }
        numEntries++; // Step 15
        book = newBook;
    }

    // New step 18-22
    /*
    public void testBook(Book tester) {
        tester.setTitle("Lord of the flies");
        // Show state change with one of the following
        System.out.println("In test: " + tester);
        System.out.println("In test: " + tester.getTitle());
    }
    */

    public String toString() {
        String info = "";

        // Step 5: Avoid crashing by testing that book is not null before using its
        // toString method
        if (book != null) {
            info += "Book: " + book + "\n";
        }

        return info;
    }

    // Step 1
    public static String getOwner() {
        return owner;
    }

    // Step 8
    public static void changeOwner(String newOwner) {
        owner = newOwner;
    }

    // Step 14
    public int getNumEntries() {
        System.out.println("Test: Owner is " + owner);
        return numEntries;
    }
}
