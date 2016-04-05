package com.example.manco.habits;


public class User {
    String name, username, password, email, password2;

    public User(String name, String email, String username, String password, String password2){
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.password2 = password2;
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.password2 = password2;
        this.email = "";
        this.name = "";

    }
}
