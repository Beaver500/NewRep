package Task9_1Access_Modifiers_Inheritance.movers;

import Task9_1Access_Modifiers_Inheritance.book.Book;
import Task9_1Access_Modifiers_Inheritance.book.Status;

public class FromArchievedStatusMover extends BookMover {

    @Override
    public void moveToStatus(Book book, Status requestedStatus) {

        if (book.getStatus() == Status.ARCHIVED) {

            switch (requestedStatus) {
                case AVAILABLE:
                    book.setStatus(requestedStatus);
                    System.out.println("Перемещен в статус AVAILABLE");
                    break;

                default:
                    System.out.println("Перевод книги из статуса 'X' в статус 'Y' невозможен");
                    break;
            }

        }
    }
}
