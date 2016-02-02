package com.blabla.model.trip;

import com.blabla.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Sebastian on 2016-02-01.
 */
@Data
@EqualsAndHashCode(exclude={"users"})
public class TripPoint implements Serializable{

    private String id;

    private String start;

    private String destination;

    private Date timeStart;

    private long takeTime;

    private int freeSpace;

    private List<User> users;
}
