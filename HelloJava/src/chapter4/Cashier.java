package chapter4;

import java.util.Scanner;

/*
 * FOR LOOP
 * Create a cahier program that will scan a given number of items and tally the cost.
*/

public class Cashier {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items that you would like to scan.");
        int quantity = scanner.nextInt();

        double total = 0;

        //For loop to iterate over the items
        for(int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the items.");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Your total is PhP" + total);
    }
    
}
