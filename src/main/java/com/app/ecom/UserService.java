package com.app.ecom;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> usersList = new ArrayList<>();

    public List<User> fetchAllUsers() {
        return usersList;
    }

    public List<User> addUser(User user) {
        usersList.add(user);
        return usersList;
    }
}
