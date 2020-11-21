package com.company;

public class Tests {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(1,"2003","MAZDA");
        System.out.println("\n"+ v1);



        LoadingTrolley lT1 = new LoadingTrolley(1,"2003","Toyota","Negro",1546.55);
        System.out.println("\n"+lT1);

        Captain c1 = new Captain(1,"Nicolas","colombiana",2003,45678,"52456-cddf6");
        System.out.println("\n"+c1);
    }
}

