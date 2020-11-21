package com.company;

public class Meteorological {
    private boolean clime;

    public Meteorological(){

    }

    public Meteorological(boolean clime) {
        this.clime = clime;
    }

    public boolean isClime() {
        return clime;
    }

    public void setClime(boolean clime) {
        this.clime = clime;
    }

    @Override
    public String toString() {
        return  "( clime:" + clime + ')';
    }
}
