package Task9_1Access_Modifiers_Inheritance.movers;

import Task9_1Access_Modifiers_Inheritance.book.Book;
import Task9_1Access_Modifiers_Inheritance.book.Status;

public class FromBorrowedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.BORROWED) {

            switch (requestedStatus) {
                case ARCHIVED:
                    book.setStatus(requestedStatus);
                    System.out.println("Перемещен в статус ARCHIVED");
                    break;
                case OVERDUED:
                    book.setStatus(requestedStatus);
                    System.out.println("Перемещен в статус OVERDUED");
                    break;
                case AVAILABLE:
                    book.setStatus(requestedStatus);
                    System.out.println("Перемещен в статус AVAILABLE");
                    break;

                /*default:
                    System.out.println("Из статуса "+book.getStatus()+" перевести книгу в статусы: BORROWED - нет возможности!");
                    break;*/
            }
        }
    }
}
