package chapter7;

import java.util.Scanner;

/*
 * Days of the week
 * Make an array that holds the days of the week
 * Ask a user to input a number corresponding to the day of the week.
 * Assume Monday is the start
 * Print the string that represents the day of the week.
*/

public class DaysOfTheWeek {

    private static Scanner scanner = new Scanner(System.in);
    private static int number;
    public static void main(String[] args){
        System.out.println("Hi! Please enter a number between 1 to 7.");
        number = scanner.nextInt();
        getDay();
        printDay();

    }
  
    public static String getDay(){

        String days[] = new String[7];

        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        if(number > 7 || number == 0){
            System.out.println("Please enter a number between 1 to 7.");
        }

        return days[number-1];

    }

    public static void printDay(){
        System.out.println(getDay());
    }
    
}
