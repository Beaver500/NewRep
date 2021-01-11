package Task12_List.Lesson;

public class UserProfile {
    private String surname;
    private String name;
    private String email;

    public UserProfile(String surname, String name, String email) {
        this.surname = surname;
        this.name = name;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
