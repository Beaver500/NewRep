package Task11_Abstractions_AndInterfaces.HomeWork1;

public class Book {
    private String bookName;
    private String bookYear;
    private String author;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String bookName, String bookYear, String author) {
        this.bookName = bookName;
        this.bookYear = bookYear;
        this.author = author;
    }

    @Override
    public String toString() {
        return ", название - " + bookName + ", год издания - " + bookYear + ", автор - " + author;
    }
}
