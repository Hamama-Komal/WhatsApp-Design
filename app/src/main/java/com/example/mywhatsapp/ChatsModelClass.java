package com.example.mywhatsapp;

public class ChatsModelClass {

    private int img;
    private String name,message,time;

    public ChatsModelClass(int img, String name, String message, String time) {
        this.img = img;
        this.name = name;
        this.message = message;
        this.time = time;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }
}
