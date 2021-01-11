package Task11_Abstractions_AndInterfaces.HomeWork1;

import Task11_Abstractions_AndInterfaces.HomeWork1.LibraryUsers.ForBookProvider;
import Task11_Abstractions_AndInterfaces.HomeWork1.LibraryUsers.ForReader;

public class BookProvider extends User implements ForReader, ForBookProvider {

    public BookProvider(String name, String surName) {
        super(name, surName);

    }

    @Override
    public void bringBook(Librarian librarian, Book book) {
        System.out.println("Поставщик принес книгу" + book + " по заказу библиотекаря " + librarian);
    }

    @Override
    public void bringBook(Administrator administrator, Book book) {
        System.out.println("Поставщик принес книгу" + book + " по заказу администратора " + administrator);
    }

    @Override
    public void takeBook(Book book) {
        System.out.println("Поставщик  запрашивает книгу" + book);
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Поставщик  вернул книгу" + book);
    }
}
