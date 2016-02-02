package com.blabla.controller.user;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by Sebastian on 2016-02-02.
 */
public class UserController {

    public static void main(String[] args) {
        get("/hello", (request, response) -> "Hello world User");
    }
}
