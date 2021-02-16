package exercises;

import java.util.Scanner;

/*
 CHANGE FOR ONE PESO
 Specify how many 25 or 50 centavo coins do you want. 
 If your coins add up to 1Php you win!
*/

public class MakeOnePeso {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double twentyFiveCents = .25;
        double fiftyCents = .50;
        int peso = 1;

        //How many 25 centavo coins do you like?
        System.out.println("How many 25 centavo coins do you like?");
        int numOfTwentyFive = scanner.nextInt();

        //How many 50 centavo coins do you like?
        System.out.println("How many 50 centavo coins do you like?");
        int numOfFifty = scanner.nextInt();
        scanner.close();

        //Computation
        String winMessage = "You win! You made 1Php!";

        double total = numOfTwentyFive * twentyFiveCents + numOfFifty * fiftyCents;

        if (total > peso){
            double amountOver = total - peso;

            System.out.println("Sorry, you are over " + String.format("%.2f", amountOver) + " cents.");
        }
        else if (total < peso){
            double amountShort = peso - total;

            System.out.println("Sorry, you are short " + String.format("%.2f", amountShort) + " cents.");
        }
        else{
            System.out.println(winMessage);
        }
        
        //Output

    }
    
}
