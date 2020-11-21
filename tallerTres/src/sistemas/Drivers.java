package sistemas;

public class Drivers {
    private int id;
    private String name;
    private String phoneNumber;
    private String passNumber;
    private boolean actualizationPass;
    private String city;
    private Company company;

    public Drivers(){

    }

    public Drivers (int id, String name, String phoneNumber, String passNumber, boolean actualizationPass, String city, Company company) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.passNumber = passNumber;
        this.actualizationPass = actualizationPass;
        this.city = city;
        this.company = company;
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

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassNumber () {
        return passNumber;
    }

    public void setPassNumber (String passNumber) {
        this.passNumber = passNumber;
    }

    public boolean isActualizationPass () {
        return actualizationPass;
    }

    public void setActualizationPass (boolean actualizationPass) {
        this.actualizationPass = actualizationPass;
    }

    public String getCity () {
        return city;
    }

    public void setCity (String city) {
        this.city = city;
    }

    public Company getCompany () {
        return company;
    }

    public void setCompany (Company company) {
        this.company = company;
    }

    @Override
    public String toString () {
        return "Drivers(" + "id:" + id + ", name:" + name + ", phoneNumber:" + phoneNumber + ", passNumber:" + passNumber + ", actualizationPass:" + actualizationPass + ", city:" + city + ", company" + company +')';
    }
}
