package chapter3;

/*
 SWITCH STATEMENT
 Have a user enter their grade, and using a
 switch statement, print out a message letting them know
 how they did.
*/

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Get student's grade
        System.out.println("Please enter student's grade.");
        String grade = scanner.next();
        scanner.close();
        //Print out message
        String message;

        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "You're doing good! Keep practicing.";
                break;
            case "D":
                message = "You need to practice a bit more.";
                break;
            case "F":
                message = "Oh no!";
                break;
            default:
                message = "That is an invalid grade.";
                break;
        }
        System.out.println(message);
    }
}
