package org.example;

import java.util.*;

public interface UserDAO {

    //in-memory storage of users
    List<User> userList = new ArrayList<>();

    /*CRUD Operations
    * Add User  (Create a new user)
    * Get User (Read/Retrieve user)
    * Delete User (Delete a user)
    * Update User (Update an existing user)
    * */

    public String addUser(User user);
    public User getUser();
    public String deleteUser(User user);
    public String updateUser(User user);

}
