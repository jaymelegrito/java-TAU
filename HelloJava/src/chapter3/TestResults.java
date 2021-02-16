package chapter3;

import java.util.Scanner;

/*
 IF-ELSE-IF
 Display a letter grade for a student
 based on their test score.
 Letter grades are A,B,C,D,F
*/

public class TestResults {
    public static void main(String[] args){

        //Get test score
        System.out.println("Enter the student's test score.");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();
        //Decide which letter grade depending on score
        char grade;

        if(score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if(score < 80){
            grade = 'C';
        }
        else if(score < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }
        System.out.println("Your grade is " + grade + ".");
    }
    
}
