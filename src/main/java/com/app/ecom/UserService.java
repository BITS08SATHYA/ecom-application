package com.app.ecom;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class UserService {

    private final UserRepository userRepository;

    private List<User> usersList = new ArrayList<>();
    private Long nextId = 1L;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> fetchAllUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
//        user.setId(nextId++);
//        usersList.add(user);
//        return usersList;
        userRepository.save(user);
    }

    public Optional<User> fetchAUsers(Long id) {
//       return usersList.stream()
//               .filter(user -> user.getId().equals(id))
//               .findFirst();
       return userRepository.findById(id);
    }

    public boolean updateUser(Long id, User UpdatedUser){
//        return usersList.stream()
//                .filter(user -> user.getId().equals(id))
//                .findFirst()
//                .map(existingUser -> {
//                    existingUser.setFirstName(UpdatedUser.getFirstName());
//                    existingUser.setLastName(UpdatedUser.getLastName());
//                    return true;
//                }).orElse(false);

        return userRepository.findById(id)
                .map(existingUser -> {
                    existingUser.setFirstName(UpdatedUser.getFirstName());
                    existingUser.setLastName(UpdatedUser.getLastName());
                    return true;
                })
                .orElse(false);
    }
}
