package sistemas;

public class Tests {
    public static void main(String[] args) {
    Company company1 = new Company(1,"trucks colombia","calle 30 N 30 A 04 ","2548565",12);
        System.out.println(company1);

        Drivers drivers1 = new Drivers(1,"nicolas","3104503280","478512",false,"tunja",company1);
        System.out.println("\n" + drivers1);

        Trucks trucks1 = new Trucks(1,"JAC",2006,152573.789,"MKP-895",45);
        System.out.println("\n" + trucks1);

        Tractomula tractomula1 = new Tractomula(1,"International",2005,125.212,"rfs-598",4300,"tunja","25 toneladas",12);
        System.out.println("\n" + tractomula1);

        Truck truck1 = new Truck(1,"Dodge",1998,145455.12,"wer-612",600,30,5);
        System.out.println("\n" + truck1);

        BoxTruck boxTruck1 = new BoxTruck(1,"iveco",2014,754457.21,"cvd-210",450,true,46);
        System.out.println("\n" + boxTruck1);
    }
}
