package com.example.redbank.api.model;

public class User {
    private String email;
    private String password;
    private int userID;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        double userID = Math.floor(Math.random() * 100_000);
        this.userID = (int) userID;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getUserID() {
        return userID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
