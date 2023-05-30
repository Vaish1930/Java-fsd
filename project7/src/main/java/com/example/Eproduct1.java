package com.example;

import java.math.BigDecimal;
import java.util.Date;

public class Eproduct1 {
    long ID;
    String name;
    BigDecimal price;
    Date date_added;
    ProductParts parts;

    public Eproduct1() {
    }

    public Eproduct1(long iD, String name, BigDecimal price, Date date_added, ProductParts parts) {
        ID = iD;
        this.name = name;
        this.price = price;
        this.date_added = date_added;
        this.parts = parts;
    }

    public long getID() {
        return ID;
    }

    public void setID(long iD) {
        ID = iD;
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

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }

    public ProductParts getParts() {
        return parts;
    }

    public void setParts(ProductParts parts) {
        this.parts = parts;
    }
}
