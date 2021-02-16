package chapter3;

import java.util.Scanner;

/*
IF statement.
All salespeople get $1000 a week.
Salespeople who exceed 10 sales will get a bonus of $250.
*/

public class SalaryCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        int weeklySales = scanner.nextInt();
        scanner.close();
        //Detour for the bonus earners
        if(weeklySales > quota){
            salary = salary + bonus;
        }
        //Output
        System.out.println("The employee's salary is $" + salary);
    }
}
