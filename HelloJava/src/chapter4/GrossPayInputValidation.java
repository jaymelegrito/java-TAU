package chapter4;

import java.util.Scanner;

/*
 WHILE LOOP
 Each employee makes $15 an hour. Write a program that allows the manager to 
 enter the number of hours worked by an employee and calculate their pay.
 No overtime.
*/

public class GrossPayInputValidation {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        //Initialize known variables
        int hourlyPay = 15;
        int maxHours = 40;

        //Get unknown variables
        System.out.println("Enter number of hours worked.");
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while (hoursWorked > maxHours){
            System.out.println("Invalid entry. Hours should only be from 1 to 40. Try again.");
            hoursWorked = scanner.nextDouble(); //sentinel
        }

        scanner.close();

        double grossPay = hourlyPay * hoursWorked;
        System.out.println("Your gross pay is " + grossPay);
    }
    
}
