package com.company;

public class CoPilot extends Pilots{
    private String gender;

    public CoPilot() {
        super();
    }

    public CoPilot(int id, String name, String nation, int birthdate, String gender) {
        super(id, name, nation, birthdate);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "("+super.toString()+ ")"+  "gender:" + gender +  ')';
    }
//no los puedo hacer :( Taxes
}
