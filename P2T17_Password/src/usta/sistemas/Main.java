package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan Ricardo Torres Céspedes
	  Date: 22/04/2020
	  Description: This software asks for a password (3 attempts only) until the password will be 352, 259 or 569.
	 */
        f_menu();

        f_main_procedure();

    }

    public static void f_menu(){
        //Description: This is the classic menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║             Password_Soft                ║");
        System.out.println("║              Version 1.0                 ║");
        System.out.println("║   Created by: Juan Ricardo Torres        ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static void f_main_procedure (){
        //Description: The main method
        Scanner keyboard = new Scanner(System.in);
        int conter = 0;

        System.out.println("Input the password: ");
        int password = keyboard.nextInt();

        if (password == 352 || password == 259 || password == 569){
            f_aceptado();
        }else {
            while (conter < 2){
                conter = conter +1;

                if (password == 352 || password == 259 || password == 569) {
                    f_aceptado();
                }else{
                    if (password != 352 || password != 259 || password != 569){
                        System.err.println("Error: invalid password");
                        System.err.println("You have only 3 Attempts.");
                        System.err.println("Your account will be locked at the third wrong attempt.");
                        System.err.println("try ("+conter+")");


                        System.out.println("Input the password again: ");
                        password = keyboard.nextInt();
                    }
                }

            }

        }

    }

    public static void f_aceptado(){
        System.out.println("You are in.");
    }

}
