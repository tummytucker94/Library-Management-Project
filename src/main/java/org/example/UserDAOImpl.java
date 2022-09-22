package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{

    List<User> userAddedList = new ArrayList<>();

    @Override
    public String addUser(User newUser) {
        userAddedList.add(newUser);
        return "new user added";
    }
}
