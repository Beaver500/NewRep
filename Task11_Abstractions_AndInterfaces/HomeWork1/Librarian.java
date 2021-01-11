package Task11_Abstractions_AndInterfaces.HomeWork1;

import Task11_Abstractions_AndInterfaces.HomeWork1.LibraryUsers.ForAdministrator;
import Task11_Abstractions_AndInterfaces.HomeWork1.LibraryUsers.ForLibrarian;
import Task11_Abstractions_AndInterfaces.HomeWork1.LibraryUsers.ForReader;

public class Librarian extends User implements ForLibrarian, ForReader, ForAdministrator {


    public Librarian(String name, String surName) {
        super(name, surName);
    }


    @Override
    public void findBook(Reader reader, Book book) {
        System.out.println("Библиотекарь выполняет работу администратора, ищет книгу" + book + " для читателя " + reader);
    }

    @Override
    public void delayNotice(Reader reader, Book book) {
        System.out.println("Библиотекарь выполняет работу администратора, уведомляет о задержке книги" + book + " читателя " + reader);
    }

    @Override
    public void giveOutABook(Reader reader, Book book) {
        System.out.println("Библиотекарь выполняет работу администратора, выдает книгу" + book + " читателю " + reader);
    }

    @Override
    public void orderBooks(BookProvider bookProvider, Book book) {
        System.out.println("Библиотекарь заказывает книгу" + book + " у поставщика " + bookProvider);
    }

    @Override
    public void takeBook(Book book) {
        System.out.println("Библиотекарь  запрашивает книгу:" + book);
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Библиотекарь вернул книгу" + book);
    }
}
