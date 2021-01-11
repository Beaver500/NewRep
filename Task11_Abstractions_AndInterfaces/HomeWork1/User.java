package Task11_Abstractions_AndInterfaces.HomeWork1;

public class User {
    private String name;
    private String surName;

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return ": фамилия " + surName + ", Имя " + name;
    }
}
