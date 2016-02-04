package com.blabla.repository.api;

import com.blabla.model.user.User;

import java.util.List;

/**
 * Created by Sebastian on 2016-02-04.
 */
public interface UserRepository {

    List<User> getAllUsers();
}
