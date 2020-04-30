package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan Ricardo Torres Céspedes
	  Date: 22/04/2020
	  Description: This software notices number series until getting one lower than 100, then it determines the sum and average of the numbers.
	 */

        f_menu();

        f_procedure();

    }

    public static void f_menu(){
        //Description: Menu
        System.out.println("-------------------------------------------");
        System.out.println("-            NumbLessThan100              -");
        System.out.println("-              Version 1.0                -");
        System.out.println("-    Created By: Juan Ricardo Torres      -");
        System.out.println("-------------------------------------------");
    }

    public static void f_procedure(){
        //Description: This method is the procedure of the software
        Scanner keyboard = new Scanner(System.in);

        int total_numbers = 0;
        double summatory = 0, average = 0, number;
        System.out.println("Input a number: ");
        number = keyboard.nextDouble();

        while (number > 100){
            summatory=summatory+number;

            total_numbers=total_numbers+1;

            System.out.println("Input other number: ");
            number = keyboard.nextDouble();

        }

        if(number!=0){
            average = summatory/total_numbers;
        }
        System.out.println("The summatory of the numbers is: "+summatory);
        System.out.println("The average is: "+average);
    }
}
