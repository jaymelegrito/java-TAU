package chapter5;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check program' that approves anyone
 * who makes more than $25,000 and has a credit score of 700 or better.
 * Reject all others.
*/

import java.util.Scanner;

public class InstantCreditCheck{

    //Initialize known variables
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //Check if user is qualified
        boolean qualified = isQualified(creditScore, salary);

        //Notify the user
        notifyApplicant(qualified);

    }

    public static double getSalary(){
        System.out.println("Enter your salary.");
        double userSalary = scanner.nextDouble();
        return userSalary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score.");
        int userCreditScore = scanner.nextInt();
        return userCreditScore;
    }

    public static boolean isQualified(int creditScore, double salary){
        if (creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyApplicant(boolean qualified){
        if(qualified){
            System.out.println("Congrats! You've been approved!");
        }
        else{
            System.out.println("Sorry, you did not meet the necessary requirements.");
        }
    }
}