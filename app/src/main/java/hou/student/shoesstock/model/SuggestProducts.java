package hou.student.shoesstock.model;

import java.io.Serializable;

public class SuggestProducts implements Serializable {
    private String title;
    private int image;

    public SuggestProducts() {
    }

    public SuggestProducts(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
