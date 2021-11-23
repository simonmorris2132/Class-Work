package com.example.ServerFromVideo.Model;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    
    private final UUID id;
    private final String name;
    private final String cohort;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name, @JsonProperty("cohort") String cohort) { /* these are json objects that are made into an array which holds the id and the name we post */
        this.id = id;
        this.name = name;
        this.cohort = cohort;
    }

    public UUID getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }

    public String getCohort() {
        return this.cohort;
    }

}
