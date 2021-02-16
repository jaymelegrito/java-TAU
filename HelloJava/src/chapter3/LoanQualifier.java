package chapter3;

import java.util.Scanner;

/*
 NESTED IF
 * To qualify for a loan, a person must make at least $3000 and have
 * been working at their current job for 2 years.
*/

public class LoanQualifier {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        //What we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get unknowns
        System.out.println("Enter applicant's salary.");
        double salary = scanner.nextDouble();
        //System.out.println("Are you currently employed?")
        //boolean isEmployed = scanner.nextBoolean();
        System.out.println("How many years have you been working at your current job?");
        int yearsOfService = scanner.nextInt();
        scanner.close();

        //Qualifier
        if (salary >= requiredSalary){

            if (yearsOfService >= requiredYearsEmployed){
                System.out.println("Conratulations! You qualify for a loan!");
            }
            else{
                System.out.println("Sorry, you did not qualify for the loan. You must be working at your present job for " 
                + requiredYearsEmployed + " or more years.");
            }
        }
        else{
            System.out.println("Sorry you must earn at least $" + requiredSalary + 
            " to qualify for a loan.");
        }
    }
    
}
