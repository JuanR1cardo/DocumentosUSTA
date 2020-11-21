package com.company;

import java.util.Objects;

public class Vehicle {
    private int id;
    protected String model;
    private String brand;

    public Vehicle(){

    }
    public Vehicle(int id, String model,String brand){
        this.id = id;
        this.model = model;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle(" + "id:" + id + ", model:" + model +  ", brand:" + brand +  ')';
    }

    @Override
    public int hashCode() {
        return id;
    }
}
