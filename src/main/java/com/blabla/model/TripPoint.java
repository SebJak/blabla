package com.blabla.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Sebastian on 2016-02-01.
 */
public class TripPoint implements Serializable{

    private String startPlace;

    private String destination;

    private List<String> indirectPlaces;
}
