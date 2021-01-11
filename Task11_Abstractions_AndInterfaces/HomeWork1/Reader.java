package Task11_Abstractions_AndInterfaces.HomeWork1;

import Task11_Abstractions_AndInterfaces.HomeWork1.LibraryUsers.ForReader;

public class Reader extends User implements ForReader {


    public Reader(String name, String surName) {
        super(name, surName);
    }


    @Override
    public void takeBook(Book book) {
        System.out.println("Читатель  запрашивает книгу" + book);

    }

    @Override
    public void returnBook(Book book) {

        System.out.println("Читатель вернул книгу" + book);
    }


}
