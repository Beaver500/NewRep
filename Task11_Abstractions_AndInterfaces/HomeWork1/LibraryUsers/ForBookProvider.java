package Task11_Abstractions_AndInterfaces.HomeWork1.LibraryUsers;

        import Task11_Abstractions_AndInterfaces.HomeWork1.Administrator;
        import Task11_Abstractions_AndInterfaces.HomeWork1.Book;
        import Task11_Abstractions_AndInterfaces.HomeWork1.Librarian;

public interface ForBookProvider {
    void bringBook(Librarian librarian, Book book);//принести книгу

    void bringBook(Administrator administrator, Book book);
}
