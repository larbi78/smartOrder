package com.example.nlarbi.smartorder.Entity;

public class Produit {

    private int id;
    private String name;
    private String status;
    private float price;

    public Produit(int id, String name, String status, float price) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
