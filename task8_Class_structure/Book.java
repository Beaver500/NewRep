package task8_Class_structure;

public class Book {
    Author author;
    String bookName;
    int year;

    public Book(Author author, String bookName, int year) {
        this.author = author;
        this.bookName = bookName;
        this.year = year;


    }

    @Override
    public String toString() {
        return "; BookName: " + bookName + ", year: " + year+", "+ author;
    }
}
