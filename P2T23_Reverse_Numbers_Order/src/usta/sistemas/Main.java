package usta.sistemas;

import java.util.Scanner;

public class Main {
    /* Author: Juan Ricardo Torres Céspedes.
      Date: 28/04/2020
      Description: This software has five numbers and shows them in reverse order.
     */

    public static void main(String[] args) {

        f_menu();

        f_user_number();

    }

    public static void f_menu() {
        //Description: Menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║            Reverse_Order_Soft            ║");
        System.out.println("║                Version 1.                ║");
        System.out.println("║      Created by: Juan Ricardo Torres     ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static void f_user_number() {
        // Description: This method asks for 5 numbers.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the first number:");
        int numb1 = keyboard.nextInt();

        System.out.println("Input the second number:");
        int numb2 = keyboard.nextInt();

        System.out.println("Input the third number:");
        int numb3 = keyboard.nextInt();

        System.out.println("Input the fourth number:");
        int numb4 = keyboard.nextInt();

        System.out.println("Input the fifth number:");
        int numb5 = keyboard.nextInt();

        System.out.println("The inverted numbers are: " + numb1 + ", " + numb2 + ", " + numb3 + ", " + numb4 + ", " + numb5 +);

        double promedio = (numb1 + numb2 + numb3 + numb4 + numb5) / 5

    }
}
