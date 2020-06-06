package usta.sistemas;

import java.util.Random;

public class Main {
    /*Author: Juan Ricardo Torres Céspedes
      Date: 04/05/2020
      Description: Salary software.
     */

    public static void main(String[] args) {
        f_menu();
        int[] salary_employees = f_salaries();

        f_show_salaries(salary_employees);
    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   Vector salary                          ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan Ricardo Torres        ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int[] f_salaries() {
        //Description: This method returns a vector with salary of 5 employees

        int[] salary = new int[5]; //This var to save the salaries of 5 employees

        for (int i = 0; i < 5; i = i + 1) {
            salary[i] = (int) Math.floor(Math.random()*(2000000 - 1000000+1)+1000000);
        }

        return salary;

    }

    public static void f_show_salaries(int[] salary) {
        //Description: This method show the salaries
        System.out.println("------The list of the salries:-------");

        for (int i = 0; i < 5; i = i + 1) {
            System.out.println("The salary of employed ("+(i+1)+") is: "+salary[i]);
        }

    }
}