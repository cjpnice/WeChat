package com.cjpnice.wechat;

public class Find {
    private int imageId;
    private String text;
    private int more;

    public Find(int imageId, String text, int more) {
        this.imageId = imageId;
        this.text = text;
        this.more = more;
    }

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

    public int getMore() {
        return more;
    }

    public void setMore(int more) {
        this.more = more;
    }
}
