package com.fpmislata.practicas.pmdm_t4a11_alzate_eslem;

/**
 * Created by eslem on 10/19/2016.
 */

public class Food {
    private String name;
    private String decription;
    private double price;

    private int image;

    public Food(String name, String decription, double price, int image) {
        this.name = name;
        this.decription = decription;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
