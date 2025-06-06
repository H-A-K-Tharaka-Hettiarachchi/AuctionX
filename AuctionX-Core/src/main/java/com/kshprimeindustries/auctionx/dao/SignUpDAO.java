package com.kshprimeindustries.auctionx.dao;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class SignUpDAO implements Serializable {

    @Expose
    private String username;
    @Expose
    private String email;
    @Expose
    private String password;
    @Expose
    private String confirmPassword;

    public SignUpDAO() {
    }

    public SignUpDAO(String username, String password, String email, String confirmPassword) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.confirmPassword = confirmPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
