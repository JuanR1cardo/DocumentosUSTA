package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // AUTHOR: Juan Ricardo Torres Céspedes
        // DATE: 30/04/2020
        // DESCRIPTION: This software simulates a products machine.

        int product= f_menu_products();

        int product_cost=f_data_product(product,1); // It returns the product cost
        int product_time=f_data_product(product,2); // It returns the spent time

        int money_user= f_input_money();

        while(money_user<product_cost){
            System.err.println("you need to input $"+(product_cost-money_user)+" amount of money");
            money_user+= f_input_money();
        }
        int surplus= money_user-product_cost;
        System.out.println("your surplus money is: $"+surplus+" the product time is: "+product_time+" seconds");

    }
    public static int f_menu_products() {
        //DESCRIPTION: This method shows the software menu
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║                        PRODUCTS_MACHINE                      ║");
        System.out.println("║  PRODUCTS             ║       VALUE      ║     CREATION TIME ║");
        System.out.println("║ 1. Aromatic           ║       $1300      ║        30 seconds ║");
        System.out.println("║ 2. Black Coffee       ║       $1000      ║        30 seconds ║");
        System.out.println("║ 3. Coffee with milk   ║       $1900      ║        45 seconds ║");
        System.out.println("║ 4. Cappuccino         ║       $2500      ║        60 seconds ║");
        System.out.println("║ 5. Mocha              ║       $2700      ║        70 seconds ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the option:");
        int option = keyboard.nextInt();
        while (option < 1 || option > 5) {
            System.err.println("ERR: THE OPTION DOES NOT EXITS");
            System.out.println("Input Again the option:");
            option = keyboard.nextInt();
        }
        return option;
    }
    public static int f_input_money() {
        // Description: This method returns the amount of money entered by the user.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input your money$:");
        int money = keyboard.nextInt();
        while (money < 50 || money > 5000) {
            System.err.println("ERR: your money cannot be processed (has to be between $50 and $5000)");
            System.out.println("Input again your money $: ");
            money = keyboard.nextInt();
        }
        return money;
    }
    public static int f_data_product(int product,int option){
        // Description: This method returns two choices (money or time)
        int data_product;
        if (product==1){  //aromatica
            if(option==1){  //money
                data_product=1300;
            }else{ //time
                data_product=30;
            }
        }else if(product==2){  //cafe negro
            if(option==1){  //money
                data_product=1000;
            }else{ //time
                data_product=30;
            }
        }else if(product==3){  //cafe con leche
            if(option==1){  //money
                data_product=1900;
            }else{ //time
                data_product=45;
            }
        }else if(product==4){ //capuchino
            if(option==1){  //money
                data_product=2500;
            }else{ //time
                data_product=60;
            }
        }else{ //mocachino
            if(option==1){  //money
                data_product=2700;
            }else{ //time
                data_product=70;
            }
        }
        return  data_product;
    }

}
