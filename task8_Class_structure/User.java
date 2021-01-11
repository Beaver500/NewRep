package task8_Class_structure;

public class User {
    String email;
    String name;
    String surname;
    Book book;


    public User(String email, String name, String surname, Book book) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.book = book;
    }

    @Override
    public String toString() {
        return " Contact user, email: " + email + "; Name user: " + name +" "+ surname  + book;
    }
}
