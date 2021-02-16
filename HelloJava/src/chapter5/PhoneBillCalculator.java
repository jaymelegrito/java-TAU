package chapter5;

/*
 * Phone Bill Calculator
 * Write a program that will calculate a subscriber's phone bill. 
 * Charge 0.25 for every minute they were over their plan
 * and 15% tax on the subtotal.
*/

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String [] args){
        System.out.println("Enter the plan fee.");
        Scanner scanner = new Scanner(System.in);
        double planFee = scanner.nextDouble();

        System.out.println("Enter overage minutes.");
        double overage = scanner.nextDouble();

        //Calculate overage
        double overageFee = calculateOverageFee(overage);

        //Calculate subtotal
        double subtotal = calculateSubtotal(planFee, overageFee);

        //Calculate tax
        double tax = calculateTax(subtotal);

        //Calculate final total
        double finalTotal = calculateFinalTotal(subtotal, tax);

        //Print statement
        printBillingStatement(planFee, overageFee, tax, finalTotal);

        scanner.close();
    }

    public static double calculateOverageFee(double overage){
        double overageFee = overage * 0.25;
        return overageFee;
    }

    public static double calculateSubtotal(double planFee, double overageFee){
        double subtotal = planFee + overageFee;
        return subtotal;
    }

    public static double calculateTax(double subtotal){
        double tax = (subtotal) * 0.15;
        return tax;
    }

    public static double calculateFinalTotal(double subtotal, double tax){
        double total = subtotal + tax;
        return total;
    }

    public static void printBillingStatement(double planFee, double overageFee, double tax, double finalTotal){
        System.out.println("Your Phone Bill Statement:");
        System.out.println("Plan Fee: $" + String.format("%.2f",planFee));
        System.out.println("Overage Fee: $" + String.format("%.2f",overageFee));
        System.out.println("Tax: $" + String.format("%.2f",tax));
        System.out.println("Total: $" + String.format("%.2f",finalTotal));
    }
}
