package chapter9;

/*
 * Overriding the calculatePerimeter method in Rectangle
*/

public class Square extends Rectangle {
    
    @Override
    public double calculatePerimeter(){
        return sides * length;
    }
}
