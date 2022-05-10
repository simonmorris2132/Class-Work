package com.careerdevs.gorestsql.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String gender;
    @Column(length = 255)
    private String status;

    public User() {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.status = status;
    }
 
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return name;
    }

    public String getEmail() {
        return this.email;
    }

    public String setEmail(String email) {
        return email;
    }

    public String getGender() {
        return this.gender;
    }

    public String getStatus() {
        return this.status;
    }

    public String generateReport() {
        return name + " is currently " + status + ". You can contact them at: " + email;
    }

    @Override
    public String toString() {
        return "{" +
            " id = '" + getId() + "'" +
            ", name = '" + getName() + "'" +
            ", email = '" + getEmail() + "'" +
            ", gender = '" + getGender() + "'" +
            ", status = '" + getStatus() + "'" +
            "}";
    }

    

 
}