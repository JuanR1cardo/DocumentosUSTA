package com.company;

public class LoadingTrolley extends Vehicle {
    private String color;
    private double mileage;

    public LoadingTrolley() {
        super();
    }

    public LoadingTrolley(int id, String model, String brand, String color, double mileage) {
        super(id, model, brand);
        this.color = color;
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "("+super.toString()+ ")"+  "color:" + color + ", mileage:" + mileage + ')';
    }
    //no los puedo hacer :( Taxes
}
