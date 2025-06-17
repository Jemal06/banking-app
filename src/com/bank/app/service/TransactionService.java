package com.bank.app.service;

import com.bank.app.model.User;

import java.util.ArrayList;

public class TransactionService {


   private UserService userService;

   public TransactionService (UserService userService){
       this.userService = userService;
   }

    public void depositToUser(String name,double amount){
        for(User user: userService.getAllUsers()){
            if (user.getName().equalsIgnoreCase(name)){
                user.getAccount().deposit(amount);
                System.out.println("Deposit successful. New balance: " + user.getAccount().getBalance());
                return;
            }
        }
        System.out.println("User not found");
    }


    public void withdrawFromUser(String name, double amount) {
        for (User user : userService.getAllUsers()){
            if (user.getName().equalsIgnoreCase(name)) {
                user.getAccount().withdrow(amount);
                System.out.println("Withdrowal is successful. New balance: " + user.getAccount().getBalance());
            return;
            }
        }
        System.out.println("User not found");
    }


    public void transfer(String fromPhoneNumber, String fromCardNunmber, double amount){


    }


}
