package com.company;

public class Airport {

    private int id;
    private String airportName;
    private String direction;
    private String phone;

    public Airport(){

    }

    public Airport(int id, String airportName, String direction, String phone) {
        this.id = id;
        this.airportName = airportName;
        this.direction = direction;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirportName(String airportName) {
        return this.airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getDirection(String direction) {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Airport(" + "id:" + id + ", airportName:'" + airportName + ", direction:" + direction + ", phone:" + phone + ')';
    }
}