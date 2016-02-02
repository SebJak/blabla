package com.blabla.model.trip;

import com.blabla.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Created by Sebastian on 2016-02-01.
 */
@Data
@EqualsAndHashCode(exclude={"places"})
public class Trip {

    private String id;

    private List<TripPoint> places;

    private User owner;


}
