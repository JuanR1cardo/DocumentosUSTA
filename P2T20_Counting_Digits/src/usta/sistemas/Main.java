package usta.sistemas;

import java.util.Scanner;

public class Main {
     /*Author: Juan Ricardo Torres Céspedes
      Date: 27/04/2020
      Description: This software counts the number of digits of a number entered.
     */

    public static void main(String[] args) {

        f_menu();

        int number = f_user_number();
        int total_digits = 0;

        if (number != 0){
            while (number != 0) {
                number = number / 10;
                total_digits = total_digits + 1;
            }
        }else{
            total_digits = total_digits + 1;
        }



        System.out.println("Total digits: "+total_digits);

    }

    public static void f_menu() {
        // Description: Menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║         Counting_Digits_Sof              ║");
        System.out.println("║             Version 1.0                  ║");
        System.out.println("║       Created by: Juan Ricardo Torres    ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int f_user_number() {
        // Description: This method asks a number, also returns it.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input a number:");
        int user_number = keyboard.nextInt();

        return user_number;
    }

}
