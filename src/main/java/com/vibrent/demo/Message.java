package com.vibrent.demo;

public class Message {

    private String message;

    public Message(String msg) {
        this.message = "Hello " + msg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }

}