package Task15_TreeSet.HomeWork;

import java.util.*;

public class Contact {
    private String name;
    private String surname;
    private String phone;
    private GroupEnum group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public GroupEnum getGroup() {
        return group;
    }

    public void setGroup(GroupEnum group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Имя " + name + " Фамилия " + surname + " телефон " + phone;
    }


}
