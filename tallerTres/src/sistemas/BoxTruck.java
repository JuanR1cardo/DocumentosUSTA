package sistemas;

public class BoxTruck extends Trucks implements Taxes{
    private boolean available;
    private int totalTolls;

    public BoxTruck(){
        super();
    }

    public BoxTruck (int id, String brand, int model, double mileage, String licensePlate, int cylinderCapacity, boolean available, int totalTolls) {
        super(id, brand, model, mileage, licensePlate, cylinderCapacity);
        this.available = available;
        this.totalTolls = totalTolls;
    }

    public boolean isAvailable () {
        return available;
    }

    public void setAvailable (boolean available) {
        this.available = available;
    }

    public int getTotalTolls () {
        return totalTolls;
    }

    public void setTotalTolls (int totalTolls) {
        this.totalTolls = totalTolls;
    }

    @Override
    public String toString () {
        return "BoxTruck(" + "available:" + available + ", totalTolls:" + totalTolls + "tollsValue $" + getTolls() + ')';
    }

    @Override
    public int getTolls () {
        return (totalTolls * 20000);
    }
}
