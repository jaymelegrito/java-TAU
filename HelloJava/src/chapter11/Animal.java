package chapter11;

public interface Animal {
    
    void makeSound();

    default void eat(){
        System.out.println("I am eating");
    }
}
