package chapter7;

import java.util.Random;
import java.util.Arrays;

public class LottoTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String [] args){
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }
    
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
            int randomNumber;
             
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(search(ticket, randomNumber));   
            
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    public static void printTicket(int ticket[]){
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }  
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not.
     */
    public static boolean search(int[] array, int numberToSearchFor){
        /*
         * Enhanced for loop
         * It iterates through array and
         * each time assigns it to value.
        */
        for(int value: array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        /*
         * If not found
        */
        return false;
    }

    /**
     * Does a binary search
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not.
     */
    public static boolean binarySearch(int[] array, int numberToSearchFor){
        //Sort the array first
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);

        if(index >= 0){
            return true;
        }
        else return false;
    }
}
