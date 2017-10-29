package com.plusonetesting.section9.arrayListChallenge;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ContactTest {

    private static final String CONTACT_1 = "Contact_1";
    private static final String PHONE_NUMBER = "12134567890";

    @Test
    public void CanWeCreateAContactWithNameAndNumber() {
        Contact contact = new Contact(CONTACT_1, PHONE_NUMBER);
        assertThat(contact.getName(), is(CONTACT_1));
        assertThat(contact.getPhoneNumber(), is(PHONE_NUMBER));
    }
}