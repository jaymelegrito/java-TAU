package exercises;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){

        //1. Ask for a season
        System.out.println("Enter a season.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Ask for a whole number
        System.out.println("Enter a whole number.");
        int wholeNumber = scanner.nextInt();

        //3. Ask for an adjective
        System.out.println("Enter an adjective.");
        String adjective = scanner.next();
        scanner.close();
        //4.Complete the sentence
        System.out.println("On a " + adjective + " " + season + " day, " + "I drink a minimum of " + wholeNumber + " cups of coffee.");
    }
}
