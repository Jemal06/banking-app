package com.bank.app.model;

public class Account {

private String accountNumber;
private double balance;


public Account(String accountNumber){
    this.accountNumber = accountNumber;
    this.balance = 0.0;
}

public void deposit(double amount){
    if (amount <= 0){
        System.out.println("Error");
    }else {
        this.balance += amount;
    }
}

public void withdrow(double amount){
    if (amount<=0){
        System.out.println("Error");}
    else if (amount > balance){
        System.out.println("Error");
    }else {this.balance -= amount;}
}





public double getBalance (){
return balance;
}



}