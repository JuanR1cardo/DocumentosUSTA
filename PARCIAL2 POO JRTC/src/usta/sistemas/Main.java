package usta.sistemas;
import usta.sistemas.student.Class;
import usta.sistemas.student.Controller;

public class Main {

    public static void main(String[] args) {
        /*Controller
        Controller c = new Controller();
        c.save(0, 31372, "Santiago", "Pedraza", 2001, "24 Diciembre 2020",
                1, "Ingeniería");
        c.save(1, 48321, "Manuela", "Pedraza", 2001, "24 Diciembre 2020",
                1, "Ingeniería");
        c.update(1, 32185, "Santiago", "Pedraza", 2001, "24 Diciembre 2020",
                1, "Ingeniería");
        c.save(2, 96253, "Santiago", "Pedraza", 2001, "24 Diciembre 2020",
                1, "Ingeniería");
        c.save(3, 83218, "Santiago", "Pedraza", 2001, "24 Diciembre 2020",
                1, "Ingeniería");
        c.save(4, 75635, "Santiago", "Pedraza", 2001, "24 Diciembre 2020",
                1, "Ingeniería");
        c.save(5, 21365, "Santiago", "Pedraza", 2001, "24 Diciembre 2020",
                1, "Ingeniería");
        c.save(6, 12385, "Santiago", "Pedraza", 2001, "24 Diciembre 2020",
                1, "Ingeniería");
        c.save(7, 65311, "Santiago", "Pedraza", 2001, "24 Diciembre 2020",
                1, "Ingeniería");
        c.delete(7);
        c.list();*/

        //Class
        Class student1 = new Class(0, 31372, "Santiago", "Pedraza", 2001,
                "24 Diciembre 2020", 1, "Ingeniería");
        System.out.printf(student1.toString());
    }
}
