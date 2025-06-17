package com.bank.app.model;

public class User {
    String name;
    private Account account;
    private String phoneNumber;
    private String cardNumber;


    public User(String name, String phoneNumber, String cardNumber) {
        this.name = name;
        this.account = new Account("ACCT-" + name);
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
    }


    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCardNumber(){return cardNumber;}


}