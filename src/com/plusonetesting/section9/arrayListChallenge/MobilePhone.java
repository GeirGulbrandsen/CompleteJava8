package com.plusonetesting.section9.arrayListChallenge;

import java.util.ArrayList;
import java.util.stream.Collectors;

class MobilePhone {

    private final String phoneId;
    private final ArrayList<Contact> contactList = new ArrayList<>();

    MobilePhone(String phoneId) {
        this.phoneId = phoneId;
    }

    String getPhoneId() {
        return phoneId;
    }

    int addContact(String name, String phoneNumber) {
        if (contactList
                .stream()
                .filter(c -> c.getName().equals(name))
                .collect(Collectors.toList())
                .size() > 0) {
            return -1;

        } else {

            contactList.add(new Contact(name, phoneNumber));

            return contactList.indexOf(contactList
                    .stream()
                    .filter(c -> c.getName().equals(name))
                    .collect(Collectors.toList()).get(0)) + 1;
        }
    }

    int getNumberOfContacts() {
        return contactList.size();
    }

    void printContacts() {
        for (Contact contact :
                contactList) {
            System.out.println(contact);
        }
    }

    Contact getContact( String name) {
        return contactList
                .stream()
                .filter(contact -> contact.getName().equals(name))
                .findFirst().orElse(null);
    }

    int setContact(String name, String phoneNumber) {
        int position = contactList.indexOf(contactList
                .stream()
                .filter(contact -> contact.getName().equals(name))
                .findFirst().orElse(null));

        if (position > -1) {
            contactList.set(position, new Contact(name, phoneNumber));
        }

        return position;
    }

    boolean removeContact(String contact) {
        return contactList.remove(contactList
                .stream()
                .filter(c -> c.getName().equals(contact))
                .findFirst().orElse(null));

    }

    String searchForContact(String name) {
        return contactList
                .stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElse(new Contact("", "No contact found"))
                .getPhoneNumber();
    }
}
