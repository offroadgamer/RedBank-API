package com.example.redbank.service;

import com.example.redbank.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user = new User("olafkri05@gmail.com", "gregoragjorg", 1);
        User user2 = new User("henkz@gmail.com", "henke123", 2);

        userList.addAll(Arrays.asList(user, user2));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }

}
