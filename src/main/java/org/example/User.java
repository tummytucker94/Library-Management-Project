package org.example;

import java.util.Scanner;

public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public void registerUser(){
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public User() {
    }

    public User(String firstName) {
        this.firstName = firstName;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public User(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }
}
