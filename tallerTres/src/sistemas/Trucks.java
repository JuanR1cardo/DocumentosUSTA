package sistemas;

public class Trucks {
    private int id;
    private String brand;
    private int model;
    private double mileage;
    private String licensePlate;
    private int cylinderCapacity;


    public Trucks () {

    }

    public Trucks (int id, String brand, int model, double mileage, String licensePlate, int cylinderCapacity) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.licensePlate = licensePlate;
        this.cylinderCapacity = cylinderCapacity;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public int getModel () {
        return model;
    }

    public void setModel (int model) {
        this.model = model;
    }

    public double getMileage () {
        return mileage;
    }

    public void setMileage (double mileage) {
        this.mileage = mileage;
    }

    public String getLicensePlate () {
        return licensePlate;
    }

    public void setLicensePlate (String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getCylinderCapacity () {
        return cylinderCapacity;
    }

    public void setCylinderCapacity (int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    @Override
    public String toString () {
        return "Trucks(" + "id:" + id + ", brand:" + brand  + ", model:" + model + ", mileage:" + mileage + ", licensePlate:" + licensePlate + ", cylinderCapacity:" + cylinderCapacity + ", UseTime: "+ getUseTime() +')';
    }
    public int getUseTime(){
        return 2020 - model;
    }
}