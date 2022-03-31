package com.careerdevs.gorestapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommentModel {
    private int id;
    @JsonProperty("post_id")
    private int postId;    
    private String name;
    private String email;
    private String body;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostId() {
        return this.postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "{" +
            " id = '" + getId() + "'" +
            ", postId = '" + getPostId() + "'" +
            ", name = '" + getName() + "'" +
            ", email = '" + getEmail() + "'" +
            ", body = '" + getBody() + "'" +
            "}";
    }


}
