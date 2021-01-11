package Task9_1Access_Modifiers_Inheritance.movers;

import Task9_1Access_Modifiers_Inheritance.book.Book;
import Task9_1Access_Modifiers_Inheritance.book.Status;

public class FromOverduedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.OVERDUED) {

            switch (requestedStatus) {
                case AVAILABLE:
                    book.setStatus(requestedStatus);
                    System.out.println("Перемещен в AVAILABLE");
                    break;
                case ARCHIVED:
                    book.setStatus(requestedStatus);
                    System.out.println("Перемещен в ARCHIVED");
                    break;

                default:
                    System.out.println("Перевод книги из статуса 'X' в статус 'Y' невозможен");
                    break;
            }

        }
    }
}
