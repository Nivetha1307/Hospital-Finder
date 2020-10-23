package com.example.algorithms;

public class Sort implements Comparable<Sort> {
    private int km;
    private String name;

    public Sort() {
    }

    public Sort(int km, String name) {
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

    @Override
    public int compareTo(Sort o) {
        return this.km > o.km ? 1:(this.km<o.km ? -1 : 0);
    }
}
