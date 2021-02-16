package chapter3;

import java.util.Scanner;

/*
 * IF ELSE
 * All salespeople are expected to make 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
*/

public class QuotaCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Known values
        int quota = 10;

        //Get unknown values
        System.out.println("Enter employee's sales this week.");
        int sales = scanner.nextInt();
        scanner.close();
        //Detour
        if(sales >= quota){
            System.out.println("Congratulations! You made " + sales + 
            " sales this week! You made the quota!");
        }
        else{
            int deficit = quota - sales;
            System.out.println("You are short by " + deficit + " sales this week. " + 
            "I know you can do better than that!");
        }   
        
    }
    
}
