package com.example.mentalhealth;

public class User {
    private String id;

    private String name;



    public User(){

    }

    public User(String id,  String name){
        this.id = id;

        this.name = name;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public void setUsername(String name) {
        this.name = name;
    }



    public String getUsername() {
        return name;
    }
}
