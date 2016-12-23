package com.example.mahendran.test.model;

/**
 * Created by Mahendran on 17-10-2016.
 */

public class Listviewmodel {
    private int images;
    private String title;
    private String desc;

    public Listviewmodel(int images, String title, String desc) {
        this.images = images;
        this.title = title;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
