package com.company;

public class Captain extends Pilots {
    private int flightHours;
    private String CPLLicenseCode;

    public Captain() {
        super();

    }

    public Captain(int id, String name, String nation, int birthdate, int flightHours, String CPLLicenseCode) {
        super(id, name, nation, birthdate);
        this.flightHours = flightHours;
        this.CPLLicenseCode = CPLLicenseCode;
    }

    public int getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(int flightHours) {
        this.flightHours = flightHours;
    }

    public String getCPLLicenseCode() {
        return CPLLicenseCode;
    }

    public void setCPLLicenseCode(String CPLLicenseCode) {
        this.CPLLicenseCode = CPLLicenseCode;
    }

    @Override
    public String toString() {
        return "("+super.toString()+ ")"+ "flightHours:" + flightHours + ", CPLLicenseCode:" + CPLLicenseCode + ')';
    }
    //no los puedo hacer :( Taxes
}
