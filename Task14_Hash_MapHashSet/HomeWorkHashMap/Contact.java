package Task14_Hash_MapHashSet.HomeWorkHashMap;

import java.util.Objects;

public class Contact {
    private String nameContact;
    private String numberContact;

    public Contact(String name, String number) {
        this.nameContact = name;
        this.numberContact = number;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public String getNumberContact() {
        return numberContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(nameContact, contact.nameContact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameContact);
    }

    public void setNumberContact(String numberContact) {
        this.numberContact = numberContact;
    }

    @Override
    public String toString() {
        return "Имя " + nameContact + ", Телефон: +" + numberContact + '\n';
    }
}
