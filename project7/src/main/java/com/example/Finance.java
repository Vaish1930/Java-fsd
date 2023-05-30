package com.example;

public class Finance {
    long financeID;
    String name;
    String ftype;

    public Finance(long financeID, String name, String ftype) {
        this.financeID = financeID;
        this.name = name;
        this.ftype = ftype;
    }

    public long getFinanceID() {
        return financeID;
    }

    public void setFinanceID(long financeID) {
        this.financeID = financeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }
}
