package com.company;

import java.util.Objects;

public class Airplane {
    private int id;
    private String countryOfOrigin;
    private int passengers;
    private Meteorological meteorological;

    public Airplane() {
    }

    public Airplane(int id, String countryOfOrigin, int passengers, Meteorological meteorological) {
        this.id = id;
        this.countryOfOrigin = countryOfOrigin;
        this.passengers = passengers;
        this.meteorological = meteorological;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public Meteorological getMeteorological() {
        return meteorological;
    }

    public void setMeteorological(Meteorological meteorological) {
        this.meteorological = meteorological;
    }

    @Override
    public String toString() {
        return "Airplane(" + "id:" + id + ", countryOfOrigin:" + countryOfOrigin + ", passengers:" + passengers + ", meteorological:" + meteorological + ')';
    }

    @Override
    public int hashCode() {
        return id;
    }
}
