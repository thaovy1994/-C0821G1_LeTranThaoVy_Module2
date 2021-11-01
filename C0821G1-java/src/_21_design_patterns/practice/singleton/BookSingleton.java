package _21_design_patterns.practice.singleton;

public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    private BookSingleton() {
        author = "Gamma, Helm, Johnson, and Vlissides";
        title = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle() {
        return getTitle() + " by " + getAuthor();
    }

    //method for borrow books
    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    //method for return books
    public void returnBook(BookSingleton bookReturned) {
        isLoanedOut = false;
    }
}
