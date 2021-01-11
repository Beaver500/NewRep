package Task9_1Access_Modifiers_Inheritance;

/*Рассмотрим предметную область обычной библиотеки. У каждой книги есть один из следующих статусов: взято в пользование (BORROWED), доступно (AVAILABLE), задержана (OVERDUED), в архиве (ARCHIVED).

Из одного статуса доступно только ограниченное число статусов. Диаграмма переходов указана здесь:

Необходимо с помощью наследования реализовать программу, в которой будет 4 наследника базового класса BookMover по переводу статуса книги из одного в другой. Данный функционал пригодится в случае массового перевода книг в какой-то статус, но мы пока рассмотрим перевод только одной книги.

Также необходимо будет описать класс Book с базовым набором полей 'title' и 'status'.

Функционал программы
Создание книги с начальным статусом AVAILABLE;
Возможноcть перевода из статуса AVAILABLE только в статус BORROWED или ARCHIVED (так же в другие статусы согласно схеме);
В случае перевода книги в недопустимый для нее статус вывести сообщение: "Перевод книги из статуса 'X' в статус 'Y' невозможен".
Процесс реализации
Создайте Enum класс Status с 4 возможными статусами в нашей программе.
Создайте класс BookMover с дефолтной реализацией метода moveToStatus.
protected void moveToStatus(Book book, Status requestedStatus) {
    System.out.println("Moving status...");
}
Создайте 4 наследника данного класса. Например: FromArchievedStatusMover — класс, в котором будут происходить проверка и переход книги из статуса ARCHIVED в запрашиваемый статус, если он возможен. Если он невозможен, то вывести сообщение: "Перевод книги из статуса 'X' в статус 'Y' невозможен". Проверку доступности необходимо сделать, используя Enum, созданный на первом шаге, оператор switch и диаграмму переходов.
В классе Main.java необходимо будет создать объект класса Book, используя конструктор. Убедитесь, что функции перехода были реализованы верно и статус у книги корректный. Например:
   Book book = new Book("The Lord of the Rings");
   BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
   fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
   System.out.println(book.getStatus());*/
import Task9_1Access_Modifiers_Inheritance.book.Book;
import Task9_1Access_Modifiers_Inheritance.book.Status;
import Task9_1Access_Modifiers_Inheritance.movers.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Book book = new Book("NewBook");
        FromAvailableStatusMover fromAvailableStatusMover = new FromAvailableStatusMover();
        FromArchievedStatusMover fromArchievedStatusMover = new FromArchievedStatusMover();
        FromBorrowedStatusMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        FromOverduedStatusMover fromOverduedStatusMover = new FromOverduedStatusMover();


      /*  fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        fromBorrowedStatusMover.moveToStatus(book, Status.ARCHIVED);
        fromArchievedStatusMover.moveToStatus(book, Status.AVAILABLE);*/


        /*BookMover[] movers = {fromAvailableStatusMover, fromBorrowedStatusMover, fromArchievedStatusMover, fromOverduedStatusMover};
        checkMoves(movers, book);*/

        while (true) {
            System.out.println("");
            System.out.println("Текущий статус книги " + book.getStatus());
            System.out.println("");
            System.out.println("Выберете статус для книги по номеру: ");
            System.out.println("№1 взять в пользование BORROWED");//BORROWED
            System.out.println("№2 задержана OVERDUED");//OVERDUED
            System.out.println("№3 добавить в архив ARCHIVED");//ARCHIVED
            System.out.println("№4 в доступе AVAILABLE");//AVAILABLE
            System.out.println("end  - для завершения");
            System.out.print("Введите номер: ");


            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int x = Integer.parseInt(input);


            switch (x) {
                case (1):
                    if (book.getStatus() == Status.AVAILABLE)
                        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
                    else
                        System.out.println("Книга со статусом "+book.getStatus()+" не может быть переведена в статус BORROWED");
                    break;
                case (2):
                    if (book.getStatus() == Status.BORROWED)
                        fromBorrowedStatusMover.moveToStatus(book, Status.OVERDUED);
                    else
                        System.out.println("Книга со статусом "+book.getStatus()+" не может быть переведена в статус OVERDUED");
                    break;

                case (3):
                    if (book.getStatus() == Status.BORROWED)
                        fromBorrowedStatusMover.moveToStatus(book, Status.ARCHIVED);
                    if (book.getStatus() == Status.OVERDUED)
                        fromOverduedStatusMover.moveToStatus(book, Status.ARCHIVED);
                    if (book.getStatus() == Status.AVAILABLE)
                        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);


                    break;


                case (4):
                    if (book.getStatus() == Status.BORROWED)
                        fromBorrowedStatusMover.moveToStatus(book, Status.AVAILABLE);
                    if (book.getStatus() == Status.OVERDUED)
                        fromOverduedStatusMover.moveToStatus(book, Status.AVAILABLE);
                    if (book.getStatus() == Status.ARCHIVED)
                        fromArchievedStatusMover.moveToStatus(book, Status.AVAILABLE);

                    break;

            }


        }

    }


    /*private static void checkMoves(BookMover[] movers, Book book) {

        for (BookMover bookMover : movers) {


            System.out.println("был " + book.getStatus());
            bookMover.moveToStatus(book, Status.BORROWED);
            System.out.println("стал " + book.getStatus());
            System.out.println();

            break;



            System.out.println("Текущий статус книги " + book.getStatus());
            bookMover.moveToStatus(book, Status.OVERDUED);
            System.out.println("Стал " + book.getStatus());
            System.out.println();

            System.out.println("был " + book.getStatus());
            bookMover.moveToStatus(book, Status.ARCHIVED);

            System.out.println("Стал " + book.getStatus());
            System.out.println();


    }*/
}



