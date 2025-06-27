package com.app.ecom;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> usersList = new ArrayList<>();
    private Long nextId = 1L;

    public List<User> fetchAllUsers() {
        return usersList;
    }

    public List<User> addUser(User user) {
        user.setId(nextId++);
        usersList.add(user);
        return usersList;
    }

    public Optional<User> fetchAUsers(Long id) {
       return usersList.stream()
               .filter(user -> user.getId().equals(id))
               .findFirst();
    }

    public boolean updateUser(Long id, User UpdatedUser){
        return usersList.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .map(existingUser -> {
                    existingUser.setFirstName(UpdatedUser.getFirstName());
                    existingUser.setLastName(UpdatedUser.getLastName());
                    return true;
                }).orElse(false);
    }
}
