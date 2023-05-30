package com.example;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eproduct")
public class Eproduct {

    @Id
    @GeneratedValue
    int id;
    String name;
    BigDecimal price;
    Date date_added;
    List<Color> colors;
    Map finance;
    Set<OS> os;
    Collection<ScreenSizes> screenSizes;

    public Eproduct() {
    }

    public Eproduct(int id, String name, BigDecimal price, Date date_added, List<Color> colors, Map finance, Set<OS> os,
            Collection<ScreenSizes> screenSizes) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date_added = date_added;
        this.colors = colors;
        this.finance = finance;
        this.os = os;
        this.screenSizes = screenSizes;
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

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public Map getFinance() {
        return finance;
    }

    public void setFinance(Map finance) {
        this.finance = finance;
    }

    public Set<OS> getOs() {
        return os;
    }

    public void setOs(Set<OS> os) {
        this.os = os;
    }

    public Collection<ScreenSizes> getScreenSizes() {
        return screenSizes;
    }

    public void setScreenSizes(Collection<ScreenSizes> screenSizes) {
        this.screenSizes = screenSizes;
    }

}