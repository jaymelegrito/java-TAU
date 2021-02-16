package chapter4;

/*
 * NESTED LOOP
 * Find the average of each student's test score.
 * There are 24 students and 4 tests.
*/

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        //Known variables
        int numberOfStudents = 24;
        int numberOfTests = 4;
        double studentAverage;

        for (int i = 0; i < numberOfStudents; i++){
            
            double total = 0;

            for (int j = 0; j < numberOfTests; j++){
                System.out.println("Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;

            }
            studentAverage = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + studentAverage);
        }

        scanner.close();

    }
    
}
