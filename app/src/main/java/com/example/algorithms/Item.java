package com.example.algorithms;

public class Item {
    private int km;
    private String name;

    public Item() {
    }

    public Item(int km, String name) {
        this.km = km;
        this.name = name;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "km :    " + km +
                        "   " + name ;
    }
}
