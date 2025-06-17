package com.bank.app.service;

import com.bank.app.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

   private List<User> users = new ArrayList<>();
    public List<User> getAllUsers(){
        return users;
    }

    
    public void registerUser(String name, String phoneNumber, String cardNumber){
        users.add(new User(name, phoneNumber, cardNumber));
    }


    public void checkBalance(String name){
        for (User user : users){
            if (user.getName().equalsIgnoreCase(name)){
                System.out.println(user.getAccount().getBalance());
            }
        }
    }




    public void showAllUsers(){
        for (User user: users){
            System.out.println("name: " + user.getName() + "\n" + "balance:" +  + user.getAccount().getBalance());
        }

    }


}
