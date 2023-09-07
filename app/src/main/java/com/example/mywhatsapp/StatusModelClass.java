package com.example.mywhatsapp;

public class StatusModelClass {
    private  int img;
    private String name, time;

    public StatusModelClass(int img, String name, String time) {
        this.img = img;
        this.name = name;
        this.time = time;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }
}
