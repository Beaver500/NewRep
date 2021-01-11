package Task11_Abstractions_AndInterfaces.HomeWork1;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Мертвые души", "1835 год", "Н.В.Гоголь");
        Reader reader = new Reader("Игорь", "Спирин");
        Administrator administrator = new Administrator("Инна", "Григорьева");
        BookProvider bookProvider = new BookProvider("Михаил", "Лионтьев");
        Librarian librarian = new Librarian("Евгиний", "Захаров");

        reader.takeBook(book);
        administrator.findBook(reader, book);
        librarian.orderBooks(bookProvider, book);
        bookProvider.bringBook(administrator, book);
        administrator.giveOutABook(reader, book);
        administrator.delayNotice(reader, book);
        reader.returnBook(book);
    }
}
