package com.bank.app.main;

import com.bank.app.service.TransactionService;
import com.bank.app.service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){



        String choice;
        UserService userService = new UserService();
        TransactionService transactionService = new TransactionService(userService);

        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextLine();
        while (!choice.equalsIgnoreCase("exit")){

            System.out.println("1. Register new user");
            System.out.println("2. Show all users");
            System.out.println("3. Put money into the account");
            System.out.println("4. Withdraw from account");
            System.out.println("5. Show users balance");

            choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("1")){
                System.out.println("Register new user");
                String userName = scanner.nextLine();
                String phoneNumber = scanner.nextLine();
                String cardNumber = scanner.nextLine();
                userService.registerUser(userName, phoneNumber, cardNumber);
            } else if (choice.equalsIgnoreCase("2")) {
                System.out.println("Show all users");
                userService.showAllUsers();
            } else if (choice.equalsIgnoreCase("3")) {
                System.out.println("Put money into the account");
                String name = scanner.nextLine();
                Double amount = Double.parseDouble(scanner.nextLine());
                transactionService.depositToUser(name, amount);
            } else if (choice.equalsIgnoreCase("4")) {
                System.out.println("Withdraw from account");
                String name = scanner.nextLine();
                Double amount = Double.parseDouble(scanner.nextLine());
                transactionService.withdrawFromUser(name, amount);
            } else if (choice.equalsIgnoreCase("5")) {
                System.out.println("Show users balance");
                String usBalanace = scanner.nextLine();
                userService.checkBalance(usBalanace);
            }else {
                System.out.println("Error");
            }



        }



    }
}
