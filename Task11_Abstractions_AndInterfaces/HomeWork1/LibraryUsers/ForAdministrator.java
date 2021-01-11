package Task11_Abstractions_AndInterfaces.HomeWork1.LibraryUsers;

import Task11_Abstractions_AndInterfaces.HomeWork1.Book;
import Task11_Abstractions_AndInterfaces.HomeWork1.Reader;

public interface ForAdministrator {
    void findBook(Reader reader, Book book);//ищет книгу

    void delayNotice(Reader reader, Book book);// уведомление о задержке

    void giveOutABook(Reader reader, Book book);// выдает книгу
}
