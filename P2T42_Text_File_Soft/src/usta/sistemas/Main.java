package usta.sistemas;

import java.io.PrintWriter;

public class Main {
    /*Author: Juan Ricardo Torres Céspedes
      Date: 28/05/2020
      Description: this software is a begin of files use.
     */

    public static void main(String[] args) {
        try{  //Perfect action
            PrintWriter admin_files = new PrintWriter("C:\\Users\\ASUS\\Documents\\prueba.txt");
            admin_files.println("first line");
            admin_files.println("second line");
            admin_files.close();
        } catch (Exception e) { //Error
            System.err.println("Error: the error is:");
            e.printStackTrace(); // for the engineer
        }
    }

}
