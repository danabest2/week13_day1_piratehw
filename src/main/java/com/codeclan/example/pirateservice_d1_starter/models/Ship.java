package com.codeclan.example.pirateservice_d1_starter.models;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    @OneToMany(mappedBy="ship")
    private List<Pirate> pirates;

    public Ship(List<Pirate> pirates) {
        this.pirates = new ArrayList<Pirate>();
    }
}
