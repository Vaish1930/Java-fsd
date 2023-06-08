package com.example.project_10.eproduct;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Eproduct {

    @Id
    private int id;
    private String name;
    private BigDecimal price;
    private Date dateAdded;

    public Eproduct() {
    }

    public Eproduct(int id, String name, BigDecimal price, Date dateAdded) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.dateAdded = dateAdded;
    }

    public long getId() {
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
