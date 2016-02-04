package com.blabla.repository.impl;

import com.blabla.model.user.User;
import com.blabla.repository.api.UserRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sebastian on 2016-02-04.
 */
public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        User u = new User();
        u.setEmail("test@emial.com");
        u.setFirstName("Lukasz");
        u.setLastName("Kowalski");
        u.setNick("nick");
        u.setPhoneNumber("000-000-000");
        users.add(u);
        return users;
    }
}
