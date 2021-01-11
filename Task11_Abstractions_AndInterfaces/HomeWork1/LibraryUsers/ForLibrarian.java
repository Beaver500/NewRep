package Task11_Abstractions_AndInterfaces.HomeWork1.LibraryUsers;

import Task11_Abstractions_AndInterfaces.HomeWork1.Book;
import Task11_Abstractions_AndInterfaces.HomeWork1.BookProvider;

public interface ForLibrarian {
    void orderBooks(BookProvider bookProvider, Book book);//заказ киниги
}
