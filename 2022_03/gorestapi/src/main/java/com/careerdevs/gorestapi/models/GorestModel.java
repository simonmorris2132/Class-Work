package com.careerdevs.gorestapi.models;

public class GorestModel {
    private int id;
    private String name;
    private String email;
    private String gender;
    private String status;

    public GorestModel() {

    }

    public GorestModel(int id, String name, String email, String gender, String status) {
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

    public String getEmail() {
        return this.email;
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
