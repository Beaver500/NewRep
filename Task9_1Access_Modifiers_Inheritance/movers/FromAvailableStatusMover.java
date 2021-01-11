package Task9_1Access_Modifiers_Inheritance.movers;

import Task9_1Access_Modifiers_Inheritance.book.Book;
import Task9_1Access_Modifiers_Inheritance.book.Status;

public class FromAvailableStatusMover extends BookMover {

    public Object moveToStatus;

    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.AVAILABLE) {
            switch (requestedStatus) {
                case BORROWED:
                    book.setStatus(requestedStatus);
                    System.out.println(" перемещен в статус BORROWED");
                    break;
                case ARCHIVED:
                    book.setStatus(requestedStatus);
                    System.out.println(" перемещен в статус ARCHIVED");
                    break;

                /*default:
                    System.out.println("Перевод книги из статуса "+ book.getStatus()+" в статуы 'AVAILABLE' и 'OVERDUED' невозможен");
                    break;*/
            }

        }


    }
}
