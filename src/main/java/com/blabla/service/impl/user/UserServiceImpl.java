package com.blabla.service.impl.user;

import com.blabla.model.user.User;
import com.blabla.repository.api.UserRepository;
import com.blabla.repository.impl.UserRepositoryImpl;
import com.blabla.service.api.user.UserService;

import java.util.List;

/**
 * Created by Sebastian on 2016-02-02.
 */
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl() {
        this.repository = new UserRepositoryImpl();
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = repository.getAllUsers();
        return users;
    }
}
