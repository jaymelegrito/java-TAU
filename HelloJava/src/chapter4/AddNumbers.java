package chapter4;

import java.util.Scanner;

/*
 * DO-WHILE LOOP:
 * Write a program that asks for two numbers and then sums up the two numbers.
 * Do not end the program until the user says so.
*/

public class AddNumbers {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            System.out.println("Enter your first number.");
            double firstNumber = scanner.nextDouble();

            System.out.println("Enter your second number.");
            double secondNumber = scanner.nextDouble();

            double result = firstNumber + secondNumber;
            System.out.println("The sum of your numbers is " + result);

            System.out.println("Would you like to start over? True or False.");
            again = scanner.nextBoolean();

        } while(again);

        scanner.close();
    }
    
}
