package Task11_Abstractions_AndInterfaces.HomeWork1.LibraryUsers;

import Task11_Abstractions_AndInterfaces.HomeWork1.Book;

public interface ForReader {
    void takeBook(Book book);

    void returnBook(Book book);
}
