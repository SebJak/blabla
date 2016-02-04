package com.blabla.controller;

import com.blabla.controller.user.UserController;
import com.blabla.service.impl.user.UserServiceImpl;

/**
 * Created by Sebastian on 2016-02-03.
 */
public class MainApi {

    public static void main(String args[]) {
        new UserController(new UserServiceImpl());
    }
}
