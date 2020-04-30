package usta.sistemas;

import java.util.Scanner;

public class Main {
    /* Author: Juan Ricardo Torres Céspedes
      Date: 29/04/2020
      Description: This software tells how many numbers are between 1 and "n" (entered by the user) that are prime.
     */

    public static void main(String[] args) {

        f_menu();

        int user_number = f_user_number();
        int total_primes = 0;

        for (int i = 1; i <= user_number; i = i + 1) {
            if (f_prime(i) == true) {
                total_primes = total_primes  + 1;
                System.out.println("number "+i+" is prime");
            }
        }
        System.out.println("The total prime numbers are : "+total_primes);

    }

    public static void f_menu() {
        // Description: Menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║           Prime_Numbers_Soft             ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║   Created by: Juan Ricardo Torres        ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int f_user_number() {
        // Description: This method asks a number, and returns the same.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input a number:");
        int user_number = keyboard.nextInt();

        while (user_number <= 1) {
            System.err.println("Error: the number must be greater than 0");

            System.out.println("Input a number");
            user_number = keyboard.nextInt();
        }

        return user_number;
    }

    public static boolean f_prime(int user_number) {
        // Description: This method returns yes/no, to confirm if the number is prime or not.
        int counter = 0, number = 0;

        for (int i = 1; i <= user_number; i = i + 1) {
            if (user_number % i == 0) {
                counter = counter + 1;
            }
        }
        if (counter <= 0) {
            return true;
        } else {
            return false;
        }
    }

}
