package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    int id;
    String name;
    double price;
    String date_added;

    public Product() {
    }

    public Product(int id, String name, double price, String date_added) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date_added = date_added;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }
}
