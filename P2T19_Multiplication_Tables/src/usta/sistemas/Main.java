package usta.sistemas;
import java.util.Scanner;
public class Main {
    /*Author: Juan Ricardo Torres Céspedes
      Date: 27/04/2020
      Description: This software prints multiplication tables from number 1 to number 10.
     */

    public static void main(String[] args) {

        f_menu();
        int user_number = f_user_number();

        while (user_number != 0){
            f_generate_multiplication_table(user_number);
            user_number = f_user_number();
        }

    }

    public static void f_menu(){
        // Description: Menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      Multiplication_Tables_Soft          ║");
        System.out.println("║                Version 1                 ║");
        System.out.println("║     Created by: Juan Ricardo Torres      ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int f_user_number(){
        // Description: This method asks for the multiplication table the user wants, also it returns this number.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the multiply table that you want:");
        int user_numb = keyboard.nextInt();

        while (user_numb < 0 || user_numb > 99){
            System.err.println("Error: Only multiplication tables between the 0 and 99");
            System.out.println("Input again the multiplication table that you want: ");
            user_numb = keyboard.nextInt();
        }

        return user_numb;

    }

    public static void f_generate_multiplication_table(int user_number){
        // Description: This method shows the multiplication tables.

        System.out.println("The multiplication table is:");

        for (int i=1; i<=10; i++){
            System.out.println(user_number+" X "+i+" = "+user_number*i);
        }

    }
}
