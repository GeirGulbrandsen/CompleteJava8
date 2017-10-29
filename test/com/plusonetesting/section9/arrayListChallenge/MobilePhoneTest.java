package com.plusonetesting.section9.arrayListChallenge;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class MobilePhoneTest {

    private static final String MOBILE_1 = "Mobile_1";
    private static final String CONTACT_1 = "Contact_1";
    private static final String CONTACT_2 = "Contact_2";
    private static final String PHONE_NUMBER_1 = "1234567890";
    private static final String PHONE_NUMBER_2 = "2345678901";
    private MobilePhone mobilePhone = new MobilePhone(MOBILE_1);

    @Test
    public void canWeCreateAMobilePhoneWithID() {
        assertThat(mobilePhone.getPhoneId(), is(MOBILE_1));
    }

    @Test
    public void canWeAddAContactToTheContactList() {
        assertThat(mobilePhone.addContact(CONTACT_1, PHONE_NUMBER_1), is(1));
        int numberOfContacts = mobilePhone.getNumberOfContacts();
        assertThat(numberOfContacts, is(1));
        assertThat(mobilePhone.getContact(CONTACT_1).getName(), is(CONTACT_1));
    }

    @Test
    public void canWeOnlyAddContactsWithUniqueNames() {
        assertThat(mobilePhone.addContact(CONTACT_1, PHONE_NUMBER_1), is(1));
        assertThat(mobilePhone.addContact(CONTACT_1, PHONE_NUMBER_2), is(-1));
        assertThat(mobilePhone.getNumberOfContacts(), is(1));
    }

    @Test
    public void canWeRemoveAContactFromTheContactList() {
        mobilePhone.addContact(CONTACT_1, PHONE_NUMBER_1);
        mobilePhone.addContact(CONTACT_2, PHONE_NUMBER_1);
        int numberOfContacts = mobilePhone.getNumberOfContacts();
        assertThat(numberOfContacts, is(2));
        assertThat(mobilePhone.removeContact(CONTACT_1), is(true));
        numberOfContacts = mobilePhone.getNumberOfContacts();
        assertThat(numberOfContacts, is(1));
    }

    @Test
    public void isAttemptToRemoveNonExistingContactRejected() {
//        mobilePhone.addContact(CONTACT_1, PHONE_NUMBER_1);
        assertThat(mobilePhone.removeContact(CONTACT_2), is(false));

    }

    @Test
    public void canWeSearchForAContact() {
        mobilePhone.addContact(CONTACT_1, PHONE_NUMBER_1);
        assertThat(mobilePhone.searchForContact(CONTACT_1), is(PHONE_NUMBER_1));
    }

    @Test
    public void canWeSearchForANonexistentContact() {
        mobilePhone.addContact(CONTACT_1, PHONE_NUMBER_1);
        assertThat(mobilePhone.searchForContact(CONTACT_2), is("No contact found"));
    }

    @Test
    public void canWeModifyAContact() {
        mobilePhone.addContact(CONTACT_1, PHONE_NUMBER_1);
        mobilePhone.setContact(CONTACT_1, PHONE_NUMBER_2);
        assertThat(mobilePhone.getContact(CONTACT_1).getPhoneNumber(), is(PHONE_NUMBER_2));
    }

    @Test
    public void canWeModifyANonexistentContact() {
        assertThat(mobilePhone.setContact(CONTACT_2, PHONE_NUMBER_2), is(-1));
        assertThat(mobilePhone.getContact(CONTACT_2), is(nullValue()));
    }

    @Test
    public void isModifyingContactNameToExistingNameRejected() {
        mobilePhone.addContact(CONTACT_1, PHONE_NUMBER_1);
        assertThat(mobilePhone.getContact(CONTACT_1).getPhoneNumber(), is(PHONE_NUMBER_1));
        mobilePhone.setContact(CONTACT_1, PHONE_NUMBER_2);
        assertThat(mobilePhone.getContact(CONTACT_1).getPhoneNumber(), is(PHONE_NUMBER_2));
    }

    @Test
    public void printContacts() {
        mobilePhone.addContact(CONTACT_1, PHONE_NUMBER_1);
        mobilePhone.addContact(CONTACT_2, PHONE_NUMBER_2);

        mobilePhone.printContacts();
    }
}
