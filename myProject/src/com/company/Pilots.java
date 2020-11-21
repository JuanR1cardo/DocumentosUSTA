package com.company;

import java.util.Objects;

public class Pilots {
    private int id;
    private String name;
    private String nation;
    private int birthdate;

    public Pilots() {
    }

    public Pilots(int id, String name, String nation, int birthdate) {
        this.id = id;
        this.name = name;
        this.nation = nation;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Pilots(" + "id:" + id + ", name:" + name +  ", nation:" + nation +  ", birthdate:" + birthdate + ')';
    }

    @Override
    public int hashCode() {
        return id;
    }
}
//no los puedo hacer :( Taxes
