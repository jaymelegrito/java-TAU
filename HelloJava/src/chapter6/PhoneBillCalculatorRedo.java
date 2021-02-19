package chapter6;

import java.util.Scanner;

public class PhoneBillCalculatorRedo{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter subscriber ID:");
        int subscriberId = scanner.nextInt();

        System.out.println("Enter overage minutes:");
        double overMinutes = scanner.nextDouble();
        
        PhoneBill phoneBill = new PhoneBill(subscriberId, 1450.75, 10, overMinutes);
        phoneBill.printItemizedBill();

        scanner.close();
    }
}