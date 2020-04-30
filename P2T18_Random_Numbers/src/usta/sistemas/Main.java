package Usta.sistemas;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class Main {
    	/*Author: Juan Ricardo Torres Céspedes
	      Date 27/04/2020
	      Description: This software makes a raffle, you can win an olimpus burguer
	 */

    public static void main(String[] args) {

        f_menu();

        System.out.println("Input a number between 0 to 100");
        System.out.println("If you write the correct number, you win the hamburger");


        int random_number = f_random_number();
        int user_number = f_user_number();
        int attemps = 5;

        while (user_number != random_number && attemps > 1){
            attemps = attemps - 1;
            System.err.println("This isn´t the correct number");
            System.out.println("Try again, attemps ("+attemps+")");
            f_user_number();
        }

        if (attemps > 1){
            System.out.println("You have won the burguer");
        }else{
            System.out.println("You lost, the number was "+random_number);
        }

    }
    public static void f_menu(){
        //Description: Menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║             Luck_Soft                    ║");
        System.out.println("║             Version 1.0                  ║");
        System.out.println("║     Created by: Juan Ricardo Torres      ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int f_random_number(){
        //Description: This method makes a random number, and return the same.

        int number = (int) Math.floor(Math.random() * 100 + 1);

        if (number < 50){
            System.out.println("Hint 1: the number is minor than 50");
        }else {
            System.out.println("Hint 1: the number is greater than 50");
        }

        if (number % 2 == 0){
            System.out.println("Hint 2: the number is pair");
        }else {
            System.out.println("Hint 2: the number is odd");
        }

        return number;

    }

    public static int f_user_number(){
        // Description: This method asks for a number to the user, and return the same.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input a number");
        int user_numb = keyboard.nextInt();

        while (user_numb < 0 || user_numb > 100){
            System.err.println("Error: the number must be in the range of 0 and 100");
        }

        return user_numb;
    }
}
