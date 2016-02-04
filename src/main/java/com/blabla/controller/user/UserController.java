package com.blabla.controller.user;

import com.blabla.service.api.user.UserService;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.ws.developer.SerializationFeature;

import java.io.IOException;
import java.io.StringWriter;

import static spark.Spark.*;

/**
 * Created by Sebastian on 2016-02-02.
 */
public class UserController {

    private static final String EMPTY_STRING = "";

    public static String dataToJson(Object data) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EMPTY_STRING;
    }

    public UserController(UserService service) {
        get("/users", (request, response) -> {
            response.status(200);
            response.type("application/json");
            return dataToJson(service.getAllUsers());
        });//service.getAllUsers()

        get("/user/:id", (request, response) -> "Get User by id: "+ request.params(":id")); //change methdo
    }
}
