package sistemas;

public class Tractomula extends Trucks implements Taxes {
    private String location;
    private String loadingCapacity;
    private int totalTolls;

    public Tractomula(){
        super();
    }

    public Tractomula (int id, String brand, int model, double mileage, String licensePlate, int cylinderCapacity, String location, String loadingCapacity,int totalTolls) {
        super(id, brand, model, mileage, licensePlate, cylinderCapacity);
        this.location = location;
        this.loadingCapacity = loadingCapacity;
        this.totalTolls = totalTolls;
    }

    public String getLocation () {
        return location;
    }

    public void setLocation (String location) {
        this.location = location;
    }

    public String getLoadingCapacity () {
        return loadingCapacity;
    }

    public void setLoadingCapacity (String loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    public int getTotalTolls () {
        return totalTolls;
    }

    public void setTotalTolls (int totalTolls) {
        this.totalTolls = totalTolls;
    }

    @Override
    public String toString () {
        return "Tractomula(" + "location:" + location  + ", loadingCapacity:" + loadingCapacity + ", totalTolls:" + totalTolls + ", tollsValue $" +getTolls() + ')' ;
    }

    @Override
    public int getTolls () {
        return (totalTolls * 32500 );
    }
}
