package com.plusonetesting.section7;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void canSetAndGetAccountNumber() {
        Account account = new Account();
        assertEquals("", account.getAccountNumber());
        account.setAccountNumber("12345");
        assertEquals("12345", account.getAccountNumber());
    }

    @Test
    public void canSetAndGetBalance() {
        Account account = new Account();
        assertEquals(0, account.getBalance(), 0);
        account.setBalance(100);
        assertEquals(100, account.getBalance(), 0);
    }

    @Test
    public void canSetAndGetCustomerName() {
        Account account = new Account();
        assertEquals("", account.getCustomerName());
        account.setCustomerName("Geir");
        assertEquals("Geir", account.getCustomerName());
    }

    @Test
    public void canSetAndGetEmailAddress() {
        Account account = new Account();
        assertEquals("", account.getEmailAddress());
        account.setEmailAddress("me@myserver.com");
        assertEquals("me@myserver.com", account.getEmailAddress());
    }

    @Test
    public void canSetAndGetPhoneNumber() {
        Account account = new Account();
        assertEquals("", account.getPhoneNumber());
        account.setPhoneNumber("55512345");
        assertEquals("55512345", account.getPhoneNumber());
    }

    @Test
    public void canDepositFunds(){
        Account account = new Account();
        account.setBalance(50);
        account.deposit(1.5);
        assertEquals(51.5, account.getBalance(), 0);
    }

    @Test
    public void canWithdrawFunds() {
        Account account = new Account();
        account.setBalance(100);
        assertEquals(94.8, account.withdraw(5.2), 0);
    }

    @Test
    public void withdrawalFailWhenToLittleFunds() {
        Account account = new Account();
        account.setBalance(10);
        assertEquals(10, account.withdraw(10.01), 0);
    }

}