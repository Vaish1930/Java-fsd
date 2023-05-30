package com.example;

public class Color {

    private long colorId;
    private String name;

    public Color(long colorId, String name) {
        this.colorId = colorId;
        this.name = name;
    }

    public Color() {
    }

    public long getColorId() {
        return colorId;
    }

    public void setColorId(long colorId) {
        this.colorId = colorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
