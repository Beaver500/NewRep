package Task14_Hash_MapHashSet.HomeWorkHashMap;


import java.util.*;


public class PhoneContacts {
    private Map<String, Set<Contact>> phoneContacts;

    public PhoneContacts() {

        phoneContacts = new HashMap<>();
    }

    public void addGroup(String group) {
        if (!phoneContacts.containsKey(group)) {
            Set<Contact> contacts = new HashSet<>();
            phoneContacts.put(group, contacts);
        } else {
            System.out.println("Данная группа уже существует!");
        }
    }

    public void addContact(String group, Contact contact) {
        if (!phoneContacts.containsKey(group)) {
            System.out.println("Данной группы не существует, контакт не добавлен");
        } else {
            Set<Contact> contacts = phoneContacts.get(group);
            if (contacts.contains(contact)) {
                System.out.println("Контакт уже сущесвтует в данной группе");
            } else {
                contacts.add(contact);
            }

        }
    }

    public void printContacts() {
        System.out.println("Группы в справочнике");
        for (String group : phoneContacts.keySet()) {
            System.out.printf("Группа - %s:\n", group);
            Set<Contact> contacts = phoneContacts.get(group);
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
            System.out.println();
        }
    }
}