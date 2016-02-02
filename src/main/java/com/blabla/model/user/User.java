package com.blabla.model.user;

import com.blabla.model.Car;
import com.blabla.model.trip.Trip;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Sebastian on 2016-02-01.
 */
@Data
@EqualsAndHashCode(exclude={"myTrips"})
public class User implements Serializable {

    private String nick;

    private String email;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String password;

    private List<Trip> myTrips;

    private Car car;

}
