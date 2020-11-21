package sistemas;

public class Company {
    private int id;
    private String name;
    private String direction;
    private String nitNumber;
    private int workers;

    public Company(){
    }

    public Company (int id, String name, String direction, String nitNumber, int workers) {
        this.id = id;
        this.name = name;
        this.direction = direction;
        this.nitNumber = nitNumber;
        this.workers = workers;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getDirection () {
        return direction;
    }

    public void setDirection (String direction) {
        this.direction = direction;
    }

    public String getNitNumber () {
        return nitNumber;
    }

    public void setNitNumber (String nitNumber) {
        this.nitNumber = nitNumber;
    }

    public int getWorkers () {
        return workers;
    }

    public void setWorkers (int workers) {
        this.workers = workers;
    }

    @Override
    public String toString () {
        return "Company(" + "id:" + id + ", name:" + name +  ", direction:" + direction  + ", nitNumber:" + nitNumber +  ", workers:" + workers + ')';
    }
}
