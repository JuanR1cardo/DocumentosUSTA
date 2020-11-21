package sistemas;

public class Truck extends Trucks implements Taxes{
    private int numberOfGallons;
    private int totalTolls;

    public Truck(){
        super();
    }

    public Truck (int id, String brand, int model, double mileage, String licensePlate, int cylinderCapacity, int numberOfGallons, int totalTolls) {
        super(id, brand, model, mileage, licensePlate, cylinderCapacity);
        this.numberOfGallons = numberOfGallons;
        this.totalTolls = totalTolls;
    }

    public int getNumberOfGallons () {
        return numberOfGallons;
    }

    public void setNumberOfGallons (int numberOfGallons) {
        this.numberOfGallons = numberOfGallons;
    }

    public int getTotalTolls () {
        return totalTolls;
    }

    public void setTotalTolls (int totalTolls) {
        this.totalTolls = totalTolls;
    }

    @Override
    public String toString () {
        return "Truck(" + "numberOfGallons:" + numberOfGallons + ", totalTolls:" + totalTolls + ", tollsValue $" +getTolls() + ')';
    }

    @Override
    public int getTolls () {
        return (totalTolls * 28000);
    }
}
