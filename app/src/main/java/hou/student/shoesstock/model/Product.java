package hou.student.shoesstock.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String productName;
    private String productPrice;
    private int productImage;
    private String trademark;

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public Product(String productName, String productPrice, int productImage, String trademark) {
        this.productName = productName;
        this.trademark = trademark;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }
}
