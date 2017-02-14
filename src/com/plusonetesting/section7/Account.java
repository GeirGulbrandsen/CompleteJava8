package com.plusonetesting.section7;

class Account {
    private String  accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    Account() {
        this("", 0.0, "", "", "");
    }

    private Account(String accountNumber, double balance, String customerName, String emailAddress, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    double withdraw(double amount) {
        if (this.balance >= amount)
            this.balance -= amount;
        return this.balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    String getCustomerName() {
        return customerName;
    }

    void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    String getEmailAddress() {
        return emailAddress;
    }

    void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
