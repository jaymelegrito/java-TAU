package chapter11;

public class Farm {
    
    public static void main(String[] args){
        
        Animal piggy = new Pig();
        System.out.println("Hi I'm piggy.");
        piggy.eat();
        piggy.makeSound();

        Animal donald = new Duck();
        System.out.println("Hi I'm Donald");
        donald.eat();
        donald.makeSound();
    }
}
