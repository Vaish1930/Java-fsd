package com.example;

public class ScreenSizes {
    long screenId;
    String size;

    public ScreenSizes() {
    }

    public ScreenSizes(long screenId, String size) {
        this.screenId = screenId;
        this.size = size;
    }

    public long getScreenId() {
        return screenId;
    }

    public void setScreenId(long screenId) {
        this.screenId = screenId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
