package com.kshprimeindustries.auctionx.dao;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class LogInDAO implements Serializable {

    @Expose
    private String username;
    @Expose
    private String password;

    public LogInDAO() {
    }

    public LogInDAO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
