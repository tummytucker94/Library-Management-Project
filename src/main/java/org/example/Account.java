package org.example;

import java.util.Scanner;

public class Account {

    //adding the user
    public void registerUserAccount(){
        User user1 = new User();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstname = scanner.nextLine();
        user1.setFirstName(firstname);

        System.out.println("Enter your last name: ");
        String lastname = scanner.nextLine();
        user1.setLastName(lastname);

        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        user1.setUsername(username);

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        user1.setPassword(password);

        System.out.println("User has been registered");
    }

    public void loginToUserAccount(String username, String password){
        if(username == "abc" && password == "password"){
            System.out.println("Password is correct");
        }else{
            System.out.println("Password not correct");
        }
    }
}
