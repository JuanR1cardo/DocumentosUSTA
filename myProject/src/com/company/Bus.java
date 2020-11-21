package com.company;

public class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus() {
        super();
    }

    public Bus(int id, String model, String brand, int passengerCapacity) {
        super(id, model, brand);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "("+super.toString()+ ")"+  "passengerCapacity=" + passengerCapacity +')';
    }
    //no los puedo hacer :( Taxes
}
