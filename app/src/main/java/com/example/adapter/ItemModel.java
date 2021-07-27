package com.example.adapter;

public class ItemModel {
    private String name;
    private int imgurl;

    public ItemModel(String name, int imgurl) {
        this.name = name;
        this.imgurl = imgurl;
    }

    public ItemModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgurl() {
        return imgurl;
    }

    public void setImgurl(int imgurl) {
        this.imgurl = imgurl;
    }
}
