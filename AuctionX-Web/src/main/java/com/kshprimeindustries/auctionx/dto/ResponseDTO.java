package com.kshprimeindustries.auctionx.dto;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class ResponseDTO implements Serializable {

    @Expose
    private boolean success;
    @Expose
    private String message;

    public ResponseDTO() {
    }

    public ResponseDTO(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
