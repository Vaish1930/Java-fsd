package com.example;

public class OS {
    long osId;
    String name;

    public OS() {
    }

    public OS(long osId, String name) {
        this.osId = osId;
        this.name = name;
    }

    public long getOsId() {
        return osId;
    }

    public void setOsId(long osId) {
        this.osId = osId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
