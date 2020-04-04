package com.cjpnice.wechat;

public class ContactList {
    private int imageId;
    private String text;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ContactList(int imageId, String text) {
        this.imageId = imageId;
        this.text = text;
    }
}