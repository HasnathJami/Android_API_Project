package com.example.apicall;


public class Model {
    private Float userId;
    private Float id;
    private String title;
    private String body;


    // Getter Methods

    public Float getUserId() {
        return userId;
    }

    public Float getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    // Setter Methods

    public void setUserId(Float userId) {
        this.userId = userId;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
}