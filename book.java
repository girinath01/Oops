class Book {
    String title;
    String author;
    boolean isIssued;

    void borrowBook(String borrowerName) {
        if (!isIssued) {
            isIssued = true;
            System.out.println(borrowerName + " has borrowed \"" + title + "\" by " + author);
        } else {
            System.out.println("Sorry, \"" + title + "\" is already issued.");
        }
    }

    void returnBook() {
        isIssued = false;
        System.out.println("Book \"" + title + "\" has been returned.\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "The Alchemist";
        book1.author = "Paulo Coelho";
        book1.isIssued = false;

        book1.borrowBook("John");
        book1.borrowBook("Emma");
        book1.returnBook();
        book1.borrowBook("Emma");
    }
}
