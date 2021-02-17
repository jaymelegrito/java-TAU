package chapter6;

/*
 * OBJECTS
*/

public class Rectangle {

    private double length;
    private double width;

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }

    //Getter and Setter
    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }
    
    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    //Constructor
    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }
}
