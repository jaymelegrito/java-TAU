package chapter6;

/*
 * Write a class that creates instances of the 'Rectangle' class
 * to find the total area of two rooms in a house.
*/

import java.util.Scanner;

public class HomeAreaCalculator {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        /****************
         * Rectangle 1
         ****************/
         Rectangle room1 = new Rectangle();
         System.out.println("Enter length of room 1.");
         room1.setLength(scanner.nextDouble());
         System.out.println("Enter the width of room 1.");
         room1.setWidth(scanner.nextDouble());
         double areaRoom1 = room1.calculateArea();

         scanner.close();

        /***************
         * Rectangle 2
         ***************/
        Rectangle room2 = new Rectangle(40, 15);
        double areaRoom2 = room2.calculateArea();

        double totalArea = areaRoom1 + areaRoom2;
        
        System.out.println("Area of the two rooms: " + totalArea);

        
    }
    
}
