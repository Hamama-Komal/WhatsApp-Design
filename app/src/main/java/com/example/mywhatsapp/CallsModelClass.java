package com.example.mywhatsapp;

public class CallsModelClass {

    private int img;
    private String name;
    private String timing;

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getTiming() {
        return timing;
    }

    public CallsModelClass(int img, String name, String timing) {
        this.img = img;
        this.name = name;
        this.timing = timing;
    }
}
