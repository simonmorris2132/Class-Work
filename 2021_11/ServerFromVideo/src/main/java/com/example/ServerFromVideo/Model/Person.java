package com.example.ServerFromVideo.Model;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    
    private final UUID id;
    private final String name;


    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name) { /* these are json objects that are made into an array which holds the id and the name we post */
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }


}
