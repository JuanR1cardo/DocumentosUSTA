package Controller;

import com.company.Airport;

public class ControllerDataTests {
    public static void main(String[] args) {
        AirportController ac = new AirportController();

        ac.save(1,"DORADO","Ac. 26 ##103-9 Fontibón Bogotá","320-456-5662");
        ac.list();

        ac.update(1,"jose maria cordoba","Rionegro Antioquia","301-587-8969");
        ac.list();

        ac.delete(1);
        ac.list();

        AirplaneController ic = new AirplaneController();
        ic.save(1,"España",180,false);
        ic.list();

        ic.update(1,"Mexico",123,true);
        ic.list();

        ic.delete(1);
        ic.list();


    }
}
