package chapter6;

/*
 * In this section we learned about static and we learned about 
 * using an object as return type and also as parameters to a method.
*/

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bedroom = calculator.getRoom();
        double area = calculator.calculateTotalArea(kitchen, bedroom);

        System.out.println("The total area is " + area);
        calculator.scanner.close();
    }

    public Rectangle getRoom(){ //using the object 'Rectangle' as return type
       
        System.out.println("Enter the width of the room.");
        double width = scanner.nextDouble();

        System.out.println("Enter the length of the room.");
        double length = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){ //using the object as parameter
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
    
}
