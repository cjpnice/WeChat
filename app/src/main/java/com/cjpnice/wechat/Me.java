package com.cjpnice.wechat;

public class Me {
    private int imageId;
    private String name;
    private int more;

    public Me(int imageId, String name, int more) {
        this.imageId = imageId;
        this.name = name;
        this.more = more;
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

    public int getMore() {
        return more;
    }

    public void setMore(int more) {
        this.more = more;
    }
}
