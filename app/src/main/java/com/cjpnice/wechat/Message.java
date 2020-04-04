package com.cjpnice.wechat;

public class Message {
    private int imageId;
    private String name;
    private String text;
    private String time;


    public Message(int imageId, String name, String text, String time) {
        this.imageId = imageId;
        this.name = name;
        this.text = text;
        this.time = time;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}